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
    room1.setSouth(room4);
    room1.setEast(room2);
    room1.setWest(null);

    //room 2
        room2.setNorth(null);
        room2.setSouth(null);
        room2.setEast(room1);
        room2.setWest(room3);

    //room 3
        room3.setNorth(null);
        room3.setSouth(room6);
        room3.setEast(null);
        room3.setWest(room2);

    //room 6
        room6.setNorth(room3);
        room6.setSouth(room9);
        room6.setEast(null);
        room6.setWest(null);

    //room 9
        room9.setNorth(room6);
        room9.setSouth(null);
        room9.setEast(null);
        room9.setWest(room8);

    //room 8
        room8.setNorth(room5);
        room8.setSouth(null);
        room8.setEast(room9);
        room8.setWest(room7);

    //room 5
        room5.setNorth(null);
        room5.setSouth(room8);
        room5.setEast(null);
        room5.setWest(null);

    //room7
        room7.setNorth(room4);
        room7.setSouth(null);
        room7.setEast(room8);
        room7.setWest(null);

    //room 4
        room4.setNorth(room1);
        room4.setSouth(room7);
        room4.setEast(null);
        room4.setWest(null);
    }




    public static void main(String[] args) {










    }
}
