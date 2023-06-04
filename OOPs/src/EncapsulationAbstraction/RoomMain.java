package EncapsulationAbstraction;

public class RoomMain {
    public static void main(String[] args) {
        Room default_room  = new Room(000, 0000, "Vacant");
        System.out.println(default_room.room_status);

        Customer rishi = new Customer(001, "RISHIKESH DAS", "01957956644");
        AcRoom acRoom = new AcRoom(101); // or, Room acRoom = new AcRoom(101);
        Booking booking_a_room = new Booking(01, "05/06/2023", rishi, acRoom, 3, 2);
        Payment makePayment = new Payment(69, booking_a_room);

        System.out.println("Total cost for Booking ID is " + makePayment.getBooking().getBookingID() + ": " + makePayment.getAmount());

        acRoom.checkIn(rishi);

//        Room ac = new AcRoom(101);
//        System.out.println(ac.room_rent);
//
//        Room nonAc = new NonAcRoom(201);
//        System.out.println(nonAc.room_rent);
//
//        Room deluxe = new DeluxeRoom(301);
//        System.out.println(deluxe.room_rent);
    }
}
