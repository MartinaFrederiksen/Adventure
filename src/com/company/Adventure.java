package com.company;

import java.util.Scanner;

public class Adventure {

  // Declare variables
  Scanner sc = new Scanner(System.in);
  private Room currentRoom;


  Room room1 = new Room("Room 1", "This is room 1");
  Room room2 = new Room("Room 2", "This is room 2");
  Room room3 = new Room("Room 3", "This is room 3");
  Room room4 = new Room("Room 4", "This is room 4");
  Room room5 = new Room("Room 5", "This is room 5");
  Room room6 = new Room("Room 6", "This is room 6");
  Room room7 = new Room("Room 7", "This is room 7");
  Room room8 = new Room("Room 8", "This is room 8");
  Room room9 = new Room("Room 9", "This is room 9");

  String room1(){
    return "the room is bloody red";
  }
  String room2(){ return "the room is filled with snakes";}


  public void mapOfRooms() {
    // Declare which rooms that are available to each other

    // Room 1 el. currentRoom

    currentRoom = room1;

    room1.setNorth(null);
    room1.setSouth(room4);
    room1.setEast(room2);
    room1.setWest(null);

    //room 2
    room2.setNorth(null);
    room2.setSouth(null);
    room2.setEast(room3);
    room2.setWest(room1);

    //room 3
    room3.setNorth(null);
    room3.setSouth(room6);
    room3.setEast(null);
    room3.setWest(room2);

    //room 4
    room4.setNorth(room1);
    room4.setSouth(room7);
    room4.setEast(null);
    room4.setWest(null);

    //room 5
    room5.setNorth(null);
    room5.setSouth(room8);
    room5.setEast(null);
    room5.setWest(null);

    //room 6
    room6.setNorth(room3);
    room6.setSouth(room9);
    room6.setEast(null);
    room6.setWest(null);

    //room7
    room7.setNorth(room4);
    room7.setSouth(null);
    room7.setEast(room8);
    room7.setWest(null);

    //room 8
    room8.setNorth(room5);
    room8.setSouth(null);
    room8.setEast(room9);
    room8.setWest(room7);

    //room 9
    room9.setNorth(room6);
    room9.setSouth(null);
    room9.setEast(null);
    room9.setWest(room8);

  }

  public void execute() {
    Introduction();
    mapOfRooms();

    System.out.println("You are now in " + currentRoom);



    boolean running = true;
    while (running) {

      // Plaver Input
      String playerIn = sc.nextLine();

      switch (playerIn) {
        case "go east" -> {
          if (currentRoom.getEast() == null) {
            System.out.println("Its not possible to go that way");
          } else {
            currentRoom = currentRoom.getEast();
            System.out.println(currentRoom.getDescription());
          }
        }
        case "go north" -> {
          if (currentRoom.getNorth() == null) {
            System.out.println("Its not possible to go that way");
          } else {
            currentRoom = currentRoom.getNorth();
            System.out.println(currentRoom.getDescription());
          }
        }
        case "go west" -> {
          if (currentRoom.getWest() == null) {
            System.out.println("Its not possible to go that way");
          } else {
            currentRoom = currentRoom.getWest();
            System.out.println(currentRoom.getDescription());
          }
        }
        case "go south" -> {
          if (currentRoom.getSouth() == null) {
            System.out.println("Its not possible to go that way");
          } else {
            currentRoom = currentRoom.getSouth();
            System.out.println(currentRoom.getDescription());
          }
        }
        case "look" -> {
          System.out.println("you are in: "+ currentRoom);
          System.out.println(currentRoom.getDescription());
        }
        case "help" -> {
          helpMenu();
        }
        case "exit" -> {
          running = false;
          System.out.println("Exiting game...");
        }
      }
    }

      }

  private void Introduction(){
    System.out.println("Welcome to the house of horrors, where many obstacles awaits \nOBS: Write help to receives clues");
     }

  private void helpMenu() {
    System.out.println("Help Menu:" + "\nExit = End game \nLook: Get description of your current room"
    ); }


    public static void main(String[] args) {
    Adventure obj = new Adventure();
    obj.execute();



  }


}

