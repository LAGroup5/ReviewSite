package com.launchacademy.reviews.repositories;

import com.launchacademy.reviews.models.Developer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends CrudRepository<Developer, Integer> {

}
