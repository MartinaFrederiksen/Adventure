package com.company;

public class Clues {

  private String name;
  private String description;

  //constructor
  public Clues(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void setName(String aName) {
    this.name = aName;
  }
  public void setDescription(String aDescription) {
    this.description = aDescription;
  }
}
