package uk.lset.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@Entity // This tells Hibernate to make a table out of this class
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Getter(AccessLevel.PUBLIC)
  @Setter(AccessLevel.PUBLIC)
  private Integer id;

  @Getter(AccessLevel.PUBLIC)
  @Setter(AccessLevel.PUBLIC)
  private String name;

  @Getter(AccessLevel.PUBLIC)
  @Setter(AccessLevel.PUBLIC)
  private String email;

}