package com.company;

import java.util.ArrayList;

public class Enemy {

  private String enemyName;
  private String description;
  private int healthP;
  private ArrayList<Item> weaponEnemy = new ArrayList<>();

  public Enemy(String enemyName, String description, int healthP, Weapon weapon) {
    this.enemyName = enemyName;
    this.description = description;
    this.healthP = healthP;
    this.weaponEnemy.add(weapon);
    }

  public ArrayList<Item> getWeaponEnemy() {
    return weaponEnemy;
  }
  public void dropWeapon(Weapon weapon, Room room) {
    room.addItem(weapon);
  }
  public String removeDeadEnemy(Room room){
    room.removeEnemy(room.getEnemies().get(0));
    return "You have killed " + enemyName + "!";
  }





  public String getEnemyName() {
    return enemyName;
  }

  public int getHealthP() {
    return healthP;
  }

  public void setHealthP(int healthP) {
    this.healthP = healthP;
  }
  public String getDescription() {
    return description;
  }
  }

