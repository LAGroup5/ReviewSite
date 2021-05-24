package com.launchacademy.reviews.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="review")
@NoArgsConstructor
@Getter
@Setter

public class Review {

  @Id
  @SequenceGenerator(name = "review_generator", sequenceName = "review_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "review_generator")
  @Column(name = "id", nullable = false, unique = true)
  private Integer id;

  @Column(name = "reviewer_name")
  private String reviewerName;

  @Column(name = "star_rating", nullable = false)
  private String starRating;

  @Column(name = "review")
  private String review;

//  @Column(name = "trail_id", nullable = false)
//  private String trailId;

}