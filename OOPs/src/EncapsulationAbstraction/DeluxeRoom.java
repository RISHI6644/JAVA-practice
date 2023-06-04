package EncapsulationAbstraction;

public class DeluxeRoom extends Room{
    boolean hasMiniBar;

//    public DeluxeRoom() {
//        this.hasMiniBar = true;
//    }

    public DeluxeRoom(int room_number) {
        super(room_number, "Deluxe");
        this.hasMiniBar = true;
        Room.room_rent = 5000;
    }

//    public int getRoomRent() {
//        return room_rent;
//    }

//    public void setRoomRent(int room_rent) {
//        this.room_rent = room_rent;
//    }
}
