package com.crpdev.crppetclinic.services.map;

import com.crpdev.crppetclinic.model.Visit;
import com.crpdev.crppetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by rajapandian
 * Date: 15/05/20
 * Project: crp-pet-clinic
 * Package: com.crpdev.crppetclinic.services.map
 **/
@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {

        if(null == object.getPet() || null == object.getPet().getOwner() || null == object.getPet().getId()
        || null == object.getPet().getOwner().getId()) {
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
