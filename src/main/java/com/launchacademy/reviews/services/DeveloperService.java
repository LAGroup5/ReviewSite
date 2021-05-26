package com.launchacademy.reviews.services;

import com.launchacademy.reviews.models.Developer;
import com.launchacademy.reviews.repositories.DeveloperRepository;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperService {

  private DeveloperRepository developerRepository;

  @Autowired
  public DeveloperService(DeveloperRepository developerRepository) {
    this.developerRepository = developerRepository;
  }

  public List<Developer> findAll() {
    return (List<Developer>) developerRepository.findAll();
  }

  public void save(Developer developer){
    this.developerRepository.save(developer);
  }
}
