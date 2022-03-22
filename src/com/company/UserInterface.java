package com.company;

public class UserInterface {

  public String soutPrinter(String text) throws InterruptedException {

    for (int i = 0; i <= text.length() - 1; i++) {
      System.out.print(text.charAt(i));
      Thread.sleep(20);
    }
    System.out.println();
    return text;
  }

    public void Introduction () throws InterruptedException {
      soutPrinter("Welcome to the house of horrors, where many obstacles awaits");
      System.out.println("Write help to open menu");
    }

    public void helpMenu () {
    System.out.println("Help Menu:");
    System.out.println("Directions:\n\"Go north\"\n\"Go south\"\n\"Go east\"\n\"Go west\"");
    System.out.println("Look: to get the current description of your current room");
    System.out.println("Exit: to Quit game");
    System.out.println("\"Take\" | Pick up an item you find");
    System.out.println("\"Drop\" | Get rid of an item from your inventory");
    System.out.println("\"Inventory\" | View your bag of things");

  }


}
