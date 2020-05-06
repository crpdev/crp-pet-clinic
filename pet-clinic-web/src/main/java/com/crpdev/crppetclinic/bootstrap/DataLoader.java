package com.crpdev.crppetclinic.bootstrap;

import com.crpdev.crppetclinic.model.Owner;
import com.crpdev.crppetclinic.model.PetType;
import com.crpdev.crppetclinic.model.Vet;
import com.crpdev.crppetclinic.services.OwnerService;
import com.crpdev.crppetclinic.services.PetTypeService;
import com.crpdev.crppetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCat = petTypeService.save(cat);

        System.out.println("Loaded PetType...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Rajapandian");
        owner1.setLastName("Chellimuthu");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Gokul");
        owner2.setLastName("Chellimuthu");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("v1FirstName");
        vet1.setLastName("v1LastName");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("v2FirstName");
        vet2.setLastName("v2LastName");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
