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
      public Room getSouth() {
            return South;
      }
      public Room getEast() {
            return East;
      }
      public Room getWest() {
            return West;
      }

      public String getDescription(){
            return description;
      }


      //Setters

      public void setNorth (Room North){
            this.North = North;
      }
      public void setSouth (Room South){
            this.South = South;
      }
      public void setEast (Room East){
            this.East = East;
      }
      public void setWest (Room West){
            this.West = West;
      }
      public void setDescription(String description){
            this.description = description;
      }
}