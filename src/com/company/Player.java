package com.company;

import java.util.ArrayList;

public class Player {
  private Room currentRoom;
  private String playerName;
  private ArrayList<Item> playerInventory = new ArrayList<>();


  public ArrayList<Item> getPlayerInventory(){
    return playerInventory;
  }

  //Add item too player inventory
  // Den adder item af typen item
  public void addItemPlayerInventory(Item item){playerInventory.add(item);}

  // Remove item too player inventory
  // Den remover item af typen item
  public void removeItemPlayerInventory(Item item){playerInventory.remove(item);}


  public Player(String name) {
    playerName = name;
  }
  public Player(){}

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
