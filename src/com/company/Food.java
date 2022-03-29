package com.company;



public class Food extends Item {
  //Health procentage
  private int healthP = 100;

  public Food(String name, String description) {
    super(name, description);
  }

  public Food(String name, String description, int healthP) {
    super(name, description);
    this.healthP = healthP;
  }

  public int getHealthP(){
    return healthP;
  }


}
