package com.crpdev.crppetclinic.repositories;

import com.crpdev.crppetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rajapandian
 * Date: 14/05/20
 * Project: crp-pet-clinic
 * Package: com.crpdev.crppetclinic.repositories
 **/
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
