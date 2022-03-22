package com.company;

public class Player {
  private Room currentRoom;
  private String PlayerName;

  public Player (String name) {
    PlayerName = name;
  }
  public String getName() {
    return PlayerName;
  }

  public void setName(String name){
    this.PlayerName = name;
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
