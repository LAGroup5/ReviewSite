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
@Table(name="developers")
@NoArgsConstructor
@Getter
@Setter
public class Developer {
  @Id
  @SequenceGenerator(name = "developers_generator", sequenceName = "developers_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "developers_generator")
  @Column(name="id", nullable = false, unique = true)
  private Integer id;

  @Column(name="name")
  private String name;

  @Column(name = "img_url")
  private String imgUrl;

  @Column(name = "about")
  private String about;

  public Developer(String name, String imgUrl, String about) {
    this.name = name;
    this.imgUrl = imgUrl;
    this.about = about;
  }
}

