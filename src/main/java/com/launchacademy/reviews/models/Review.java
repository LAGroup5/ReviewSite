package com.launchacademy.reviews.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reviews")
@NoArgsConstructor
@Getter
@Setter
public class Review {

  @Id
  @SequenceGenerator(name = "reviews_generator", sequenceName = "reviews_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reviews_generator")
  @Column(name = "id", nullable = false, unique = true)
  private Integer id;
  @Column(name = "reviewer_name")
  private String reviewerName;
  @Column(name = "star_rating", nullable = false)
  private Integer starRating;
  @Column(name = "body")
  private String body;

  @ManyToOne
  @JoinColumn(name = "trail_id")
  @JsonIgnore
  private Trail trail;

  public Trail getTrail() {
    return trail;
  }

  public void setTrail(Trail trail) {
    this.trail = trail;
  }
}