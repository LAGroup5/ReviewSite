package com.launchacademy.reviews.models;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
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
  @Column(name="pass_required", nullable=false)
  private Boolean passesRequired;
  @Column(name="hike_length_miles", nullable=false)
  private int hikeLengthMiles;
  @Column(name="elevation_gain_ft", nullable=false)
  private int elevationGainFt;
  @Column(name="family_friendly", nullable=false)
  private Boolean familyFriendly;
  @Column(name="pet_friendly", nullable=false)
  private Boolean petFriendly;
  //  @Column(name="facilities_available")
//  private String[] facilitiesAvailable;
  public Trail(String name, int difficulty, String description, int hikeLengthMiles, int elevationGainFt,
      Boolean passesRequired, Boolean familyFriendly, Boolean petFriendly) {
    this.name = name;
    this.difficulty = difficulty;
    this.description = description;
    this.hikeLengthMiles = hikeLengthMiles;
    this.elevationGainFt = elevationGainFt;
    this.passesRequired = passesRequired;
    this.familyFriendly = familyFriendly;
    this.petFriendly = petFriendly;
//    this.facilitiesAvailable = facilitiesAvailable;
  }
  @OneToMany(mappedBy="trail")
  private List<Review> reviewList = new ArrayList<>();
}










