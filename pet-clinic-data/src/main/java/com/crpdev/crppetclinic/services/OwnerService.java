package com.crpdev.crppetclinic.services;

import com.crpdev.crppetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
