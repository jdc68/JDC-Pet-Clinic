package jdc.spring.sfgpetclinic.repositories;

import jdc.spring.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
