package com.company;

public class Adventure {

    // START PÅ ADVENTURE
    private Room currentRoom;
    private Room requestedRoom;

    Room room1 = new Room("Room1", "This is room 1");

    // DECLARE THE ROOMS
    public void mapOfRooms() {
        currentRoom = room1;

        Room room2 = new Room("Room2", "This is room 2");
        Room room3 = new Room("Room3", "This is room 3");
        Room room4 = new Room("Room4", "This is room 4");
        Room room5 = new Room("Room5", "This is room 5");
        Room room6 = new Room("Room6", "This is room 6");
        Room room7 = new Room("Room7", "This is room 7");
        Room room8 = new Room("Room8", "This is room 8");
        Room room9 = new Room("Room9", "This is room 9");


     // Declare which rooms that are available to each other

    // Room 1 el. currentRoom

    room1.setNorth(null);


    }




    public static void main(String[] args) {










    }
}
