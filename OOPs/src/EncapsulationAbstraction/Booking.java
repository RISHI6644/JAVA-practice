package EncapsulationAbstraction;

public class Booking extends Room{
    int booking_id;
    String booking_date;
    public Customer guest;
    public Room room;
    int duration;
    int num_of_guests;

    public Booking(int booking_id, String booking_date, Customer guest, Room room, int duration, int num_of_guests) {
        this.booking_id = booking_id;
        this.booking_date = booking_date;
        this.guest = guest;
        this.room = room;
        this.duration = duration;
        this.num_of_guests = num_of_guests;
    }

    int getBookingID() {
        return booking_id;
    }

    public Room getRoom() {
        return room;
    }

//    public Customer getCustomer() {
//        return guest;
//    }

    public int getDuration() {
        return duration;
    }
}
