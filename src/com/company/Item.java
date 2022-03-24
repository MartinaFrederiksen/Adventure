package com.company;


public class Item {

  private String name;
  private String description;

  //constructor
  public Item(String name, String description) {
    this.name = name;
    this.description = description;
  }


  //Getters
  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String toString() {
    return name + ": " + description;
  }

  //Setters
  public void setName(String aName) {
    this.name = aName;
  }

  public void setDescription(String aDescription) {
    this.description = aDescription;
  }
}
