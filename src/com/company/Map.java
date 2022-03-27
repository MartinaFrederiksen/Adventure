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
    return "Welcome to Happy Smile Hospital the old sign says" +
            "There are still journals, computers and books left" + "Look for helpful items";
    //clues ???
  }

  String room2() {
    return "Looks like a bedroom" + " There is a madras" + "Old pair of shoes" +
            "Is that a needle?" + "Look for helpful items";
  }

  String room3() {
    return "The walls are falling apart" + "The stairs dosen't look too good either" +
            "Is that a man lying on the floor?" + "Look for helpful item";
    //fjende: Mand som ligger der og råber efter dem, kan angribe bla bla bla idk?
  }

  String room4() {
    return "Looks like this is were they ate" + "Am I the only one that can hear that?" +
            "Is that.... Is that a dog?" + "Looks like there is a cabinet" + "I hope there is food inside"
            + "But the dog sounds very aggressive Im scared";
    //Læs dagbog? clue?: Kære dagbog. I dag skulle en af dem snakke med hende. Jeg så hende aldrig igen
  }

  String room5() {
    return "congratulations - you have 10 second til every exit locks, hurry make a desicion before you are trapped for ever.";
  }

  String room6() {
    return "Looks like a bedroom" + "Why is the window closed off with planks?" + "The bed is also torn apart" +
            "Same with the sheets" + "That looks like a journal";
  }

  String room7() {
    return "Looks like a bedroom" + "Windows are smashed and the curtains are torn apart" +
            "Is that a hand print made out of blood?" + "Looks like a journal";
  }

  String room8() {
    return "This hallway is pretty long" + "I wonder what this leads too?" +
            "Is that a door?";
  }

  String room9() {
    return "This looks like where the worker could relax" + "A frigde? Maybe there is food inside";
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
            System.out.println("You can't go that way");
          } else {
            currentRoom = currentRoom.getEast();
            System.out.println(currentRoom + " | " + currentRoom.getDescription());
          }
        }
        case "go north" -> {
          if (currentRoom.getNorth() == null) {
            System.out.println("You can't go that way");
          } else {
            currentRoom = currentRoom.getNorth();
            System.out.println(currentRoom + " | " + currentRoom.getDescription());
          }
        }
        case "go west" -> {
          if (currentRoom.getWest() == null) {
            System.out.println("You can't go that way");
          } else {
            currentRoom = currentRoom.getWest();
            System.out.println(currentRoom + " | " + currentRoom.getDescription());
          }
        }
        case "go south" -> {
          if (currentRoom.getSouth() == null) {
            System.out.println("You can't go that way");
          } else {
            currentRoom = currentRoom.getSouth();
            System.out.println(currentRoom + " | " + currentRoom.getDescription());
          }
        }
        // Indications of what Look does
        case "look" -> {
          System.out.println("You are in: " + currentRoom);
          System.out.println(currentRoom.getDescription() + " | ITEMS AVAILABLE | " + currentRoom.getItemsInRoom());
          System.out.println( "Would you like to grab or drop an item? ");
        }
        case "grab" -> {
          System.out.println( " Which item would you like to grab?");
          String gr = sc.nextLine();
          p.grabItem(gr);
        }
        case "drop" -> {
          System.out.println("Which item would you like to drop?");
          String dr = sc.nextLine();
          p.dropItem(dr);
        }
        case "inventory" -> {
          System.out.println(p.getPlayerBag());
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
}


//drop = skrift mellem remove og add

// public void grabORdrop() { // hvorfor spørger bliver ved at stille spørgsmålet selv hvis ikke der er item i rooms?
//System.out.println("You wanna grab or drop a item?");
//Scanner gOd = new Scanner(System.in);
//System.out.println("Which item would you like to grab?");
//String input = gOd.nextLine();
//switch (input) {
//case "grab" -> { // er det ikke mindre for lie står der større end ?
// if (currentRoom.getItemsInRoom().size() > 0) { // Den er lidt spurgt fordi hvis det er større end 8 så er det lige meget om der er flere eller ej, player skal vælge
//     if (currentRoom.getItemsInRoom().size() == 1) {
//     p.addItemPlayerInventory(currentRoom.getItemsInRoom().get(0));// get(0) = det spurgte efterspurgte item
//   currentRoom.getItemsInRoom().remove(currentRoom.getItemsInRoom().get(0));
// giv den instrukser på hvad den sige
// } else {
// System.out.println("Which item would like to grab?");
//String grabInput = gOd.nextLine();
//for (int i = 0; i < currentRoom.getItemsInRoom().size(); i++)
// {
// Før forloop indeks starter med 0 + Under: condition = arraylist + Efter forloop: den plusser for hver gang
// if (grabInput == currentRoom.getItemsInRoom().get(i).getName())
// p.addItemPlayerInventory(currentRoom.getItemsInRoom().get(i));
//currentRoom.getItemsInRoom().remove(currentRoom.getItemsInRoom().get(i));
// hvis grab = navn på item, så adder den til playerInventory
// }
//}
//} else {
// System.out.println("No items found in the room");
// }
// }
//case "drop" -> {
// System.out.println("Which item would you like to drop");
//String dropInput = gOd.nextLine();
//for (int i = 0; i < p.getPlayerInventory().size(); i++) {
// if (dropInput == p.getPlayerInventory().get(i).getName())
// p.removeItemPlayerInventory(p.getPlayerInventory().get(i));
//currentRoom.getItemsInRoom().add(p.getPlayerInventory().get(i));
// }
// }
//case "regret" -> {}}}}




