package com.launchacademy.reviews.controllers;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TrailsApiV1Controller {
  private TrailService trailservice;
  private ReviewService reviewService;

  @Autowired
  public TrailsApiV1Controller (TrailService trailService, ReviewService reviewService) {
    this.trailservice = trailService;
    this.reviewService = reviewService;
  }

  @GetMapping("/trails")
  public List<Trail> getTrails() {
    return trailservice.findAll();
  }

  @GetMapping("/trails/{id}")
  public List<Trail> getTrails(@PathVariable String id) {
    return trailservice.findTrail(id);
  }

  @PostMapping("/trails/{id}/new")
  public void addReview(@RequestBody Map<String, String> reviewMap) {
    return reviewService.addReview(reviewMap);
  }

}
