package com.company;

import java.util.ArrayList;

public class Player {
  private Room currentRoom;
  private String playerName;
  private int healthStatus = 100;
  private ArrayList<Item> playerBag = new ArrayList<>();

// HEALTH
  public int getHealthStatus(){
    return healthStatus;
  }

  public void setHealthStatus(int healthStatus) {
    this.healthStatus = healthStatus;
  }

  public void updateHealthStatus(int healthStatus){
    this.healthStatus += healthStatus;
  }

// FOOD METODER

  public void eat (Food food){
   updateHealthStatus(food.getHealthP());
   currentRoom.removeItemRoomInventory(food);
   removeItemPlayerBag(food);
  }
  // Opdaterer health status
  // Siden tingene bliver automatisk bliver tilføjet til begge inventory, fjernes de nu.




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
    }
  }

  public void dropItem(String itemName) {
    Item item = findItem(itemName);
    if (item != null) {
      removeItemPlayerBag(item);
      currentRoom.addItemRoomInventory(item);
    }
  }

  public void eatFood(String itemName) {
    // See if item is in the room
    Item item = findItem(itemName);
    if (item == null) {
      item = findItem(itemName);
      if (item == null) ;
    } else {
      if (item != null) {
        //add til mave
        eat((Food) item);
        System.out.println("you have eaten" + item);
      } 
    }
  }
// ARRAYLIST

  public ArrayList<Item> getPlayerBag() {
    return playerBag;
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

  // Lav player position metode
  // Lav player move metode, så player kan bevæge sig rundt
  // Lav


}
