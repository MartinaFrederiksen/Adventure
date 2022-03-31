package com.company;

public class MeleeWeapon extends Weapon {


  public MeleeWeapon(String name, String description, int damage) {
    super(name, description, damage);
  }

  @Override
  public int availableUsesLeft() {
    return 1;
  }

  @Override
  public void setAvailableUsesSpent() {

  }
}
