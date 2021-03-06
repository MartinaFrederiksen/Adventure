package com.company;

import java.util.Scanner;

public class Map {

  UserInterface ui = new UserInterface();
  Player p = new Player();

  // Declare variables
  Scanner sc = new Scanner(System.in);

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
  String room1() { //Reception
    return "\nWelcome to Happy Smile Hospital the old sign says" +
            "" +
        "\nThere are still journals, computers and books left" + "\nLook for helpful items";
    //clues ???
  }

  String room2() { //Værelse
    return "\nLooks like a bedroom" + "\nThere is a madras..." + "\nOld pair of shoes?.." +
            "\nIs that a needle?" + "\n...Look for helpful items...";
  }

  String room3() { //Opgang/trappe?
    return "\nThe walls are falling apart" + "\nThe stairs dosen't look too good either" +
            "\nIs that a man lying on the floor?" + "\n...Look for helpful items...";
    //fjende: Mand som ligger der og råber efter dem, kan angribe bla bla bla idk?
  }

  String room4() { //spisesal
    return "\nLooks like this is were they ate" + "\nAm I the only one that can hear that?" +
            "\nIs that.... Is that a dog?" + "\nQuickly the dog is attacking you" + "\n...Look for helpful items...";
  }

  String room5() { //Kontor
    return "\ncongratulations - you have 10 second til every exit locks \nHurry make a decision before you are trapped for ever.";
  }

  String room6() { //værelse
    return "Looks like a bedroom" + "\nWhy is the window closed off with planks?" + "\nThe bed is also torn apart" +
            "\nSame with the sheets..." + "...Look for helpful items..." ;
  }

  String room7() { //værelse
    return "\nLooks like a bedroom" + "\nWindows are smashed and the curtains are torn apart" +
            "\nIs that a hand print made out of blood?" + "\nA journal! Write open to read it";
  }

  String room8() { //gang
    return "\nThis hallway is pretty long" + "\nI wonder what this leads too?" + "\nLooks like it leads to 3 different rooms";
  }

  String room9() { //medarbejder rum
    return "Looks like a staff room" + "\nA cabinet? I hope there is some food inside" +
        "\nHmmm... That looks like a key";
  }

  // Enemy Weapons
  MeleeWeapon knifeEnemy = new MeleeWeapon("knife", "It's very sharp!", -20);
  MeleeWeapon pussPoison = new MeleeWeapon("puss poison", "", -50);

  public void placeItems() { //Place the items in the different rooms
    room1.addItem(new Food("banana", "Fresh and ripe banana",20));
    room1.addItem(new MeleeWeapon("knife", "look a knife!", -20));
    room2.addItem(new RangedWeapon("gun", "9mm Glock", -50));
    room2.addItem(new Food ("waterbottle", "", 80));
    room3.addItem(new RangedWeapon("rifle", "brown rifle", -70));
    room3.addItem(new Item("key", "an old key"));
    room3.addEnemy(new Enemy("Zombie","old man with no teeth and hollow eyes", 70, knifeEnemy));
    room4.addItem(new Item("needle", "an old key"));
    room4.addEnemy(new Enemy("Dog","zombie dog with white puss coming out of its mouth", 70,pussPoison));
    room5.addItem(new Item("flashdrive", "You've found the flash! U must careful as this flash drive contains sensitive information about HAPPY SMILE HOSPITAL"));
    room6.addItem(new Food("Healingpotion", "This potion will heal all wounds",100));
    room7.addItem(new Food("bluepill", "Try your luck...",-20));
    room7.addItem(new Item("lockpicker", "this is lockpicker opens all doors"));
    room8.addItem(new MeleeWeapon("axe", "look a axe!", -40));
    room9.addItem(new Food ("apple","half eaten apple", 20) );
  }


  public void mapOfRooms() {
    // Declare which rooms that are available to each other
    // Room 1 el. currentRoom
    // currentRoom is all of the rooms.

    p.setCurrentRoom(room1);

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
    System.out.println("You are now in " + p.getCurrentRoom());
    boolean running = true;
    while (running) {
// Plaver Input
      String playerIn = sc.nextLine();
      switch (playerIn) {
        case "go east" -> {
          if (p.getCurrentRoom().getEast() == null) {
            System.out.println("You can't go that way");
          } else {
            p.setCurrentRoom(p.getCurrentRoom().getEast());
            System.out.println(p.getCurrentRoom() + " | " + p.getCurrentRoom().getDescription());
          }
        }
        case "go north" -> {
          if (p.getCurrentRoom().getNorth() == null) {
            System.out.println("You can't go that way");
          } else {
            p.setCurrentRoom(p.getCurrentRoom().getNorth());
            System.out.println(p.getCurrentRoom() + " | " + p.getCurrentRoom().getDescription());
          }
        }
        case "go west" -> {
          if (p.getCurrentRoom().getWest() == null) {
            System.out.println("You can't go that way");
          } else {
            p.setCurrentRoom(p.getCurrentRoom().getWest());
            System.out.println(p.getCurrentRoom()+ " | " + p.getCurrentRoom().getDescription());
          }
        }
        case "go south" -> {
          if (p.getCurrentRoom().getSouth() == null) {
            System.out.println("You can't go that way");
          } else {
            p.setCurrentRoom(p.getCurrentRoom().getSouth());
            System.out.println(p.getCurrentRoom() + " | " + p.getCurrentRoom().getDescription());
          }
        }
        // Indications of what Look does
        case "look" -> {
          System.out.println("You are in: " + p.getCurrentRoom());
          System.out.println(p.getCurrentRoom().getDescription() + " | ITEMS AVAILABLE | " + p.getCurrentRoom().getItemsInRoom());
          StringBuilder sbEnemy = new StringBuilder();
          for (Enemy enemy : p.getCurrentRoom().getEnemies()){
            String enemyName= (enemy) + ": " + enemy.getDescription() + "\n";
            sbEnemy.append(enemyName);
          }
          System.out.println(sbEnemy);
          System.out.println( "Would you like to equip grab, drop or eat an weapon/item/food? ");
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
        case "eat" -> {
          System.out.println("Which item would you like to eat?");
          String eat = sc.nextLine();
          p.eatFood(eat);
        }
        case "health" -> {
          p.checkHealthStat();
        }
        case "equip" -> {
          System.out.println("which weapons would you like to equip?");
          String eq = sc.nextLine();
          p.equipWeapons(eq);
        }
        case "attack" -> {
          String eName = sc.nextLine();
        p.attackEnemy(new Enemy());

        }
        case "inventory" -> {
          System.out.println(p.getPlayerBag());
        }
        case"weapons" -> {
          System.out.println(p.getEquippedWeapons());
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




