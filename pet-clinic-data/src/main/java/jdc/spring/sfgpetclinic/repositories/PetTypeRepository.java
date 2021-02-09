package jdc.spring.sfgpetclinic.repositories;

import jdc.spring.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<Pet, Long> {
}
