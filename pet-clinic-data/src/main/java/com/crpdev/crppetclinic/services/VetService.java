package com.crpdev.crppetclinic.services;

import com.crpdev.crppetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}
