package com.launchacademy.reviews.models;


import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="trails")
public class Trail {
  @Id
  @SequenceGenerator(name="trails_generator", sequenceName = "trails_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="trails_generator")
  @Column(name="id", nullable = false, unique = true)
  private Integer id;

  @Column(name="name", nullable=false)
  private String name;

  @Column(name="difficulty", nullable=false)
  private int difficulty;

  @Column(name="description", nullable=false)
  private String description;

  @Column(name="passes_required", nullable=false)
  private Boolean passesRequired;

  @Column(name="facilities_available")
  private String facilitiesAvailable;

  @Column(name="hike_length_miles", nullable=false)
  private Double hikeLengthMiles;

  @Column(name="elevation_gain_ft", nullable=false)
  private int elevation_gain_ft;

  @Column(name="family_friendly", nullable=false)
  private Boolean familyFriendly;

  @Column(name="pet_friendly", nullable=false)
  private Boolean petFriendly;

//  @OneToMany(mappedBy="trail")
//  private List<Review> reviewList = new ArrayList<>();

}
