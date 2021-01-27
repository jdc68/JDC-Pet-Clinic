package jdc.spring.sfgpetclinic.services;

import jdc.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
