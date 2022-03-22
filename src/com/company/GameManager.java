package com.company;

public class GameManager {
  UserInterface ui = new UserInterface();
  Map m = new Map();

  public void execute() throws InterruptedException {
    ui.Introduction();
    m.mapOfRooms();
    m.goDirections();
  }
}
