package jdc.spring.sfgpetclinic.services;

import jdc.spring.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetInterface {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
