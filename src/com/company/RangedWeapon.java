package com.company;

public class RangedWeapon extends Weapon{

  protected int availableUsesLeft;

  public RangedWeapon(String name, String description, int damage) {
    super(name, description, damage);
  }

  @Override
  public int availableUsesLeft() {
    return 0;
  }

  @Override
  public void setAvailableUsesSpent() {
    this.availableUsesLeft -= 1;

  }
}
