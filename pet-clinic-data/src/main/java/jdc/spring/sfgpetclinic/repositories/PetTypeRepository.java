package jdc.spring.sfgpetclinic.repositories;

import jdc.spring.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
