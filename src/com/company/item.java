package com.company;

public class item {

  private String name;
  private String description;

  public item(String name, String description) {
    this.name = name;
    this.description = description;
  }

  //Get
  public String getName() {
    return name;
  }
  public String getDescription(){
    return description;
  }
  public String toString() {
    return name + ": " + description;
  }

  //Set
  public void setName(String aName){
    this.name = aName;
  }
  public void setDescription(String aDescription){
    this.description = aDescription;
  }
}
