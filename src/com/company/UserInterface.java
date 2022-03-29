package com.company;


import java.util.Scanner;

public class UserInterface {

  private Player player;

  public Player getPlayer(){
    return player;
  }


  // Fancy text method
  public String soutPrinter(String text) throws InterruptedException {

    for (int i = 0; i <= text.length() - 1; i++) {
      System.out.print(text.charAt(i));
      Thread.sleep(20);
    }
    System.out.println();
    return text;
  }


  public String createPlayer(){
    Scanner playerName = new Scanner(System.in);
    System.out.println("Enter a player name:");
    this.player = new Player(playerName.nextLine());
    System.out.println("Your chosen player name is "+ player.getName());
    return player.getName();
  }

  public void Introduction() throws InterruptedException {
    soutPrinter("You have arrived at an old abandoned mental constitution." +
            "Soon you will realise everything is not what is seems like");
    createPlayer();
    System.out.println("""
        —————————————————————————————————————————————————————————
        You can move around by the use of Go commands such as: 
        
        Directions:\n\"Go north\"\n\"Go south\"\n\"Go east\"\n\"Go west\"
        To receive further help, write 'help' to open menu
        —————————————————————————————————————————————————————————""");
  }

  public void helpMenu() {
    System.out.println("\"Help\" | Menu:");
    System.out.println("\"Look\" | Get the description of your current room");
    System.out.println("\"Exit\" | Quit game");
    System.out.println("\"Take\" | Pick up an item you find");
    System.out.println("\"Drop\" | Get rid of an item from your inventory");
    System.out.println("\"Inventory\" | View your bag of things");

  }


  }









