package jdc.spring.sfgpetclinic.repositories;

import jdc.spring.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
