package com.launchacademy.reviews.services;

import com.launchacademy.reviews.models.Trail;
import com.launchacademy.reviews.repositories.TrailRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrailService {
  private TrailRepository trailRepo;

  @Autowired
  public TrailService(TrailRepository trailRepo) {
    this.trailRepo = trailRepo;
  }

  public List<Trail> findAll() {
    return (List<Trail>) trailRepo.findAll();
  }

  public Trail findById(Integer id) {
    return this.trailRepo.findById(id).get();
  }
}
