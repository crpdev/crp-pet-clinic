package com.crpdev.crppetclinic.bootstrap;

import com.crpdev.crppetclinic.model.Owner;
import com.crpdev.crppetclinic.model.Vet;
import com.crpdev.crppetclinic.services.OwnerService;
import com.crpdev.crppetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Rajapandian");
        owner1.setLastName("Chellimuthu");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Gokul");
        owner2.setLastName("Chellimuthu");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("v1FirstName");
        vet1.setLastName("v1LastName");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("v2FirstName");
        vet2.setLastName("v2LastName");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
