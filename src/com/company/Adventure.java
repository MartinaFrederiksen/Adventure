package com.company;

import java.util.Scanner;
public class Adventure {
  UserInterface ui = new UserInterface();
  Map m = new Map();

  public Adventure() throws InterruptedException {
  }


  public void execute() throws InterruptedException {
    ui.Introduction();
    m.mapOfRooms();
    m.goDirections();
  }


    public static void main (String[] args) throws InterruptedException {
    Adventure obj = new Adventure();
    obj.execute();

}
}


