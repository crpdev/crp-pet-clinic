package com.crpdev.crppetclinic.bootstrap;

import com.crpdev.crppetclinic.model.*;
import com.crpdev.crppetclinic.services.OwnerService;
import com.crpdev.crppetclinic.services.PetTypeService;
import com.crpdev.crppetclinic.services.SpecialtyService;
import com.crpdev.crppetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0 ){
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCat = petTypeService.save(cat);

        System.out.println("Loaded PetType...");

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        System.out.println("Loaded Speciality...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Rajapandian");
        owner1.setLastName("Chellimuthu");
        owner1.setAddress("Ashok Nagar");
        owner1.setCity("Chennai");
        owner1.setTelephone("987654321");

        Pet pet1 = new Pet();
        pet1.setPetType(savedDog);
        pet1.setOwner(owner1);
        pet1.setBirthDate(LocalDate.now());
        pet1.setName("DogPet");
        owner1.getPets().add(pet1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Gokulpandian");
        owner2.setLastName("Chellimuthu");
        owner1.setAddress("Anna Nagar");
        owner1.setCity("Chennai");
        owner1.setTelephone("987654321");

        Pet pet2 = new Pet();
        pet2.setPetType(savedCat);
        pet2.setOwner(owner1);
        pet2.setBirthDate(LocalDate.now());
        pet2.setName("CatPet");
        owner1.getPets().add(pet2);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("v1FirstName");
        vet1.setLastName("v1LastName");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("v2FirstName");
        vet2.setLastName("v2LastName");
        vet1.getSpecialities().add(savedSurgery);
        vet1.getSpecialities().add(savedDentistry);

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
