package com.company;

public  abstract class Weapon extends Item {
  protected int damage;

  public Weapon(String name, String description, int damage) {
    super(name, description);
    this.damage = damage;
  }
  public int attack (){
    return damage;
  }

  public int  getDamage(){
    return damage;
  }

  public abstract int availableUsesLeft();

  public abstract void setAvailableUsesSpent();

  public String toString() {
    return this.getName();
  }
}
