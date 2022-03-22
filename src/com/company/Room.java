package com.company;

import java.util.ArrayList;

public class Room {
  private String name;
  private String description;
  private Room North, South, East, West;
  private ArrayList<Item> items = new ArrayList<>();

  //constructor
  public Room(String name, String description, Room North, Room South, Room East, Room West) {
    this.name = name;
    this.description = description;
    this.North = North;
    this.East = East;
    this.South = South;
    this.West = West;
  }

  //constructor
  public Room(String name, String description) {
    this.name = name;
    this.description = description;
    this.items = new ArrayList<>();
  }
  //constructor
  public Room(String name, String description, ArrayList<Item> items) {
    this.name = name;
    this.description = description;
    this.items = items;
  }

  //Add item method
  public void addItem(Item item) {
    items.add(item);
  }

  //Remove item method

  //Delete item method


  // get methods
  public Room getNorth() {
    return North;
  }

  public Room getSouth() {
    return South;
  }

  public Room getEast() {
    return East;
  }

  public Room getWest() {
    return West;
  }

  public String getDescription() {
    return description;
  }

  public String toString() {
    return name;
  }

  public ArrayList<Item> getItems() {
    return items;
  }


  //set methods
  public void setNorth(Room North) {
    this.North = North;
  }

  public void setSouth(Room South) {
    this.South = South;
  }

  public void setEast(Room East) {
    this.East = East;
  }

  public void setWest(Room West) {
    this.West = West;
  }

  public void setDescription(String description) {
    this.description = description;


  }
}