package com.launchacademy.reviews.repositories;

import com.launchacademy.reviews.models.Trail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrailRepository extends CrudRepository<Trail, Integer> {

}
