package EncapsulationAbstraction;

public class Room {
    int room_number;
    String room_category;
    static int room_rent;
    String room_status;
    public Customer current_customer;

    public Room() {
        this.room_number = 0;
        this.room_category = "null";
        this.room_rent = 0000;
        this.room_status = "Vacant";
    }

    public Room(int room_number, int room_rent, String room_status) {
        this.room_number = room_number;
        this.room_rent = room_rent;
        this.room_status = room_status;
    }

    public Room(int roomNumber, String room_category) {
        this.room_number = roomNumber;
        this.room_category = room_category;
    }

//    public int getRoomNumber() {
//        return room_number;
//    }

    public String getRoomCategory() {
        return room_category;
    }

//    String getRoomstatus() {
//        return room_status;
//    }

//    public Customer getCurrentCustomer() {
//        return current_customer;
//    }

    void checkIn(Customer guest) {
        room_status = "Occupied";
        current_customer = guest;
        System.out.println(current_customer.customer_name + " Just checked in!!!");
    }

    void checkOut() {
        room_status = "Vacant";
        current_customer = null;
        System.out.println("Guest from Room " + room_number + " Just checked out!!!");
    }
}
