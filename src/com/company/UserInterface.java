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
    System.out.println("Write Look: to get the current description of your current room");
    System.out.println("Write Exit: to Quit game");
    System.out.println("Write Help: to get game directions");

  }
}
