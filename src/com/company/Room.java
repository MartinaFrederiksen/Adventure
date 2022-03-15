package com.company;

public class Room {
      private String name;
      private String description;
      private Room North, South, East, West;

      public Room(String name, String description) {

      }
      //Getters
      public Room getNorth() {
            return North;
      }

      //Setters

      public void setNorth (Room North){
            this.North = North;
      }
}