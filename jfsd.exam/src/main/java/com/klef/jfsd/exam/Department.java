package com.klef.jfsd.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int departmentId;

  @Column(name = "Name")
  private String name;

  @Column(name = "Location")
  private String location;

  @Column(name = "HoDName")
  private String hodName;

  // Getters and Setters
  public int getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getHodName() {
    return hodName;
  }

  public void setHodName(String hodName) {
    this.hodName = hodName;
  }
}
