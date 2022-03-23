package com.company;

import java.util.Scanner;

public class Map {

  UserInterface ui = new UserInterface();
  Player p = new Player();

  // Declare variables
  Scanner sc = new Scanner(System.in);
  private Room currentRoom;

  Item knife = new Item("Knife", "Careful the knife is very sharp");
  Item sword = new Item("Sword", "congratulations you found the sword of warriors");
  Item lighter = new Item("Lighter", "grey lighter");
  Item rope = new Item("Rope", "10m long rope");
  Item auqaElix = new Item("Auqa Elixer", "Drink this and you can breathe under water");
  Item bomb = new Item("bomb", " throw it and it says boom");
  Item Healing = new Item("Heling Potion", "...description pending... ");
  Item LockPicker = new Item("LockPicker", " ...description pending...");
  Item axe = new Item("axe", "description pending");

  // Declare rooms = room number + room descriptions
  Room room1 = new Room("Room 1", room1());
  Room room2 = new Room("Room 2", room2());
  Room room3 = new Room("Room 3", room3());
  Room room4 = new Room("Room 4", room4());
  Room room5 = new Room("Room 5", room5());
  Room room6 = new Room("Room 6", room6());
  Room room7 = new Room("Room 7", room7());
  Room room8 = new Room("Room 8", room8());
  Room room9 = new Room("Room 9", room9());


  // Room descriptions using String --- add to the declaring of rooms (SKRIV FLERE DESKRIPTIONER)
  String room1() {
    return "The room has bloody stains on the walls, what do you now?" + " Look for helpful items";
  }

  String room2() {
    return "The room is filled with snakes, where do you go from here?" + "Look for helpful items";
  }

  String room3() {
    return "The room is filling up with water, quickly make a move or suffer the consequences" + "Look for helpful item";
  }

  String room4() {
    return "torture room...be weary of your steps, there are booby trap all over";
  }

  String room5() {
    return "congratulations - you have 10 second til every exit locks, hurry make a desicion before you are trapped for ever.";
  }

  String room6() {
    return "...description pending...";
  }

  String room7() {
    return "...description pending...";
  }

  String room8() {
    return "...description pending...";
  }

  String room9() {
    return "...description pending...";
  }

  public void placeItems() { //Place the items in the different rooms
    room1.getItemsInRoom().add(knife);
    room2.getItemsInRoom().add(rope);
    room3.getItemsInRoom().add(auqaElix);
    room4.getItemsInRoom().add(sword);
    room5.getItemsInRoom().add(bomb);
    room6.getItemsInRoom().add(Healing);
    room7.getItemsInRoom().add(LockPicker);
    room8.getItemsInRoom().add(axe);
    room9.getItemsInRoom().add(lighter);


    //ArrayList<Item> test = new ArrayList<>();
    //test.add(knife);

  }


  public void mapOfRooms() {
    // Declare which rooms that are available to each other
    // Room 1 el. currentRoom
    // currentRoom is all of the rooms.

    currentRoom = room1;

    room1.setSouth(room4);
    room1.setEast(room2);


    //room 2
    room2.setEast(room3);
    room2.setWest(room1);

    //room 3

    room3.setSouth(room6);
    room3.setWest(room2);

    //room 4
    room4.setNorth(room1);
    room4.setSouth(room7);


    //room 5
    room5.setSouth(room8);

    //room 6
    room6.setNorth(room3);
    room6.setSouth(room9);

    //room7
    room7.setNorth(room4);
    room7.setEast(room8);

    //room 8
    room8.setNorth(room5);
    room8.setEast(room9);
    room8.setWest(room7);

    //room 9
    room9.setNorth(room6);
    room9.setWest(room8);

  }

  public void goDirections() {
    System.out.println("You are now in " + currentRoom);
    boolean running = true;
    while (running) {

      // Plaver Input
      String playerIn = sc.nextLine();

      switch (playerIn) {
        case "go east" -> {
          if (currentRoom.getEast() == null) {
            System.out.println("Denied, you may not enter");
          } else {
            currentRoom = currentRoom.getEast();
            System.out.println(currentRoom + " | " + currentRoom.getDescription());
          }
        }
        case "go north" -> {
          if (currentRoom.getNorth() == null) {
            System.out.println("Denied, you may not enter");
          } else {
            currentRoom = currentRoom.getNorth();
            System.out.println(currentRoom + " | " + currentRoom.getDescription());
          }
        }
        case "go west" -> {
          if (currentRoom.getWest() == null) {
            System.out.println("Denied, you may not enter");
          } else {
            currentRoom = currentRoom.getWest();
            System.out.println(currentRoom + " | " + currentRoom.getDescription());
          }
        }
        case "go south" -> {
          if (currentRoom.getSouth() == null) {
            System.out.println("Denied, you may not enter");
          } else {
            currentRoom = currentRoom.getSouth();
            System.out.println(currentRoom + " | " + currentRoom.getDescription());
          }
        }
        // Indications of what Look does
        case "look" -> {
          System.out.println("You are in: " + currentRoom);
          System.out.println(currentRoom.getDescription() + " | ITEMS AVAILABLE | " +
              currentRoom.getItemsInRoom());


        }

        case "inventory" -> {
          System.out.println(p.getPlayerInventory());

        }

        case "help" -> {
          ui.helpMenu();
        }
        case "exit" -> {
          running = false;
          System.out.println("Exiting game...");
        }
      }
    }
  }

  //drop = skrift mellem remove og add
  public void grabORdrop() {
    System.out.println("You wanna grab or drop a item?");
    Scanner gOd = new Scanner(System.in);
    String input = gOd.nextLine();

    switch (input) {
      case "grab" -> {
        if (currentRoom.getItemsInRoom().size() > 0) {
          if (currentRoom.getItemsInRoom().size() == 1) {
            p.addItemPlayerInventory(currentRoom.getItemsInRoom().get(0));// currentRoom.getItems().get(0) = det spurgte efter item
            currentRoom.getItemsInRoom().remove(currentRoom.getItemsInRoom().get(0));
            //
          } else {
            System.out.println("Which item would like to grab?");
            String grabInput = gOd.nextLine();
            for (int i = 0; i < currentRoom.getItemsInRoom().size(); i++) {
              // Før forloop indeks starter med 0 + Under: condition = arraylist + Efter forloop: den plusser for hver gang
              if (grabInput == currentRoom.getItemsInRoom().get(i).getName())
                p.addItemPlayerInventory(currentRoom.getItemsInRoom().get(i));
              currentRoom.getItemsInRoom().remove(currentRoom.getItemsInRoom().get(i));
              // hvis grab = navn på item, så adder den til playerInventory

            }
          }
        }

      }
    }
  }
}




