package jdc.spring.sfgpetclinic.repositories;

import jdc.spring.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
