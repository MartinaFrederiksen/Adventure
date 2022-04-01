package com.company;

import java.util.ArrayList;

public class Player {
  private Room currentRoom;
  private String playerName;
  private int healthP = 100;
  private ArrayList<Item> playerBag = new ArrayList<>();
  private ArrayList<Item> equippedWeapons = new ArrayList<>();

// HEALTH
  public int getHealthP(){
    return healthP;
  }

  public void setHealthP(int healthP) {
    this.healthP = healthP;
  }

  public void updateHealthStatus(int healthStatus){
    this.healthP += healthStatus;
  }
  public void checkHealthStat(){
    int currentHealth = getHealthP();
    if (currentHealth <= 100 && currentHealth >= 75) {
      System.out.println(currentHealth + " - You're in good shape!");
    } else if (currentHealth < 75 && currentHealth >= 50) {
      System.out.println(currentHealth + " - You're in okay shape");
    } else if (currentHealth < 50 && currentHealth >= 25) {
      System.out.println(currentHealth + " - You're getting weak");
    } else if (currentHealth < 25 && currentHealth >= 1) {
      System.out.println(currentHealth + " - You're in health danger!");
    }
  }

// FOOD METODER

  public void eat (Food food){
   updateHealthStatus(food.getHealthP());
   currentRoom.removeItemRoomInventory(food);
   removeItemPlayerBag(food);
  }
  // Opdaterer health status
  // Siden tingene bliver automatisk bliver tilføjet til begge inventory, fjernes de nu.


// EQUIP
public Weapon equipW(Weapon weapon) {

  boolean isEmpty = equippedWeapons.isEmpty();

  if (isEmpty) {
    playerBag.remove(weapon);
    equippedWeapons.add(weapon);
    return weapon;
  } else {
    playerBag.add(equippedWeapons.get(0));
    equippedWeapons.clear();
    equippedWeapons.add(weapon);
    playerBag.remove(weapon);
    return weapon;
  }
}

// ATTACK
public String attackEnemy(Enemy enemy) {



  ArrayList<Item> playersWeapon = equippedWeapons;

  if (!playersWeapon.isEmpty()) {
    ((Weapon) getEquippedWeapons().get(0)).setAvailableUsesSpent();
    if (enemy != null) {
      enemy.attackedByPlayer((Weapon) playersWeapon.get(0));
      return attackedByEnemy((Weapon) enemy.getWeaponEnemy().get(0));
    }
  }
  return null;
}

public String attackedByEnemy(Weapon weapon){
    Weapon enemysWeapon = weapon;
  return null;
}

// SWITCH METODERNE

  public Item findItem(String itemName) {
    for (Item item : currentRoom.getItemsInRoom()) {
      if (item.getName().equals(itemName)) {
        return item;
      }
    }
    return null;
  }

  public void grabItem(String itemName) {
    Item item = findItem(itemName);
    if( item != null) {
      addItemPlayerBag(item);
      currentRoom.removeItemRoomInventory(item);
      System.out.println("The item has been picked up");
    }
  }

  public void dropItem(String itemName) {
    Item item = findItem(itemName);
    if (item != null) {
      removeItemPlayerBag(item);
      currentRoom.addItemRoomInventory(item);
      System.out.println("The item has been dropped");
    }
  }

  public Availability eatFood(String itemName) {
    // See if item is in the room
    Item item = findItem(itemName);
    if (item == null) {
      item = findItem(itemName);
      if (item == null) ;
      return Availability.Not_available;
    } else {
      if (item != null) {
        //add til mave
        eat((Food) item);
        System.out.println("you have eaten" + item);
      }
    }
    return null;
  }

  public Availability equipWeapons (String itemName){

    Item item = findItem(itemName);
    if (item == null) {
      item = findItem(itemName);
      if (item == null) ;
      return Availability.Not_available;
    } else {
      if (item != null) {
        //add til mave
        equipW((Weapon) item);
        System.out.println("you have equipped " + item);
      }
    }
    return null;
  }

  public String attackMet(String enemyName) {
    //if (!equippedWeapons.isEmpty()) {
     // ((Weapon) getEquippedWeapons().get(0)).setAvailableUsesSpent();

    return null;
  }


// ARRAYLIST

  public ArrayList<Item> getPlayerBag() {
    return playerBag;
  }

  public ArrayList<Item> getEquippedWeapons() {
    return equippedWeapons;
  }

  public void addItemPlayerBag(Item item) {
    playerBag.add(item);
  }

  public void removeItemPlayerBag(Item item) {
    playerBag.remove(item);
  }





  public Player(String name) {
    playerName = name;
  }

  public Player() {
  }

  public String getName() {
    return playerName;
  }

  public void setName(String name) {
    this.playerName = name;
  }

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }
  public void gameover() {
    System.out.println("Sorry "+playerName + " you are dead!") ;
    System.out.println("GAME OVER!");
    System.exit(0);
    return;
  }
  // Lav player position metode
  // Lav player move metode, så player kan bevæge sig rundt
  // Lav


}
