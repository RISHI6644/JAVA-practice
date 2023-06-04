package EncapsulationAbstraction;

public class NonAcRoom extends Room{
    boolean hasAc;

//    public NonAcRoom() {
//        this.hasAc = false;
//    }

    public NonAcRoom(int room_number) {
        super(room_number, "Non-AC");
        this.hasAc = false;
        Room.room_rent = 2500;
    }

//    public int getRoomRent() {
//        return room_rent;
//    }

//    public void setRoomRent(int room_rent) {
//        this.room_rent = room_rent;
//    }
}
