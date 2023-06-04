package EncapsulationAbstraction;

public class AcRoom extends Room{
    boolean hasAc;

//    public AcRoom() {
//        this.hasAc = true;
//    }

    public AcRoom(int room_number) {
        super(room_number, "AC");
        this.hasAc = true;
        Room.room_rent = 3500;
    }

//    public int getRoomRent() {
//        return room_rent;
//    }

//    public void setRoomRent(int room_rent) {
//        this.room_rent = room_rent;
//    }
}
