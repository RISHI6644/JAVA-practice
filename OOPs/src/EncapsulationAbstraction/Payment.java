package EncapsulationAbstraction;

public class Payment extends Room{
    int payment_id;
    long payment_amount;
    Booking booking;
    boolean isPaid;

    public Payment(int payment_id, Booking booking) {
        this.payment_id = payment_id;
        this.booking = booking;
        this.isPaid = false;
        this.payment_amount = calculateAmount();
    }

//    public int getPaymentId() {
//        return payment_id;
//    }

    public Booking getBooking() {
        return booking;
    }

    public double getAmount() {
        return payment_amount;
    }

    long calculateAmount() {
        Room room = booking.getRoom();
        String roomCategory = room.getRoomCategory();

        int roomRent;

        if (roomCategory.equals("AC")) {
            roomRent = 3500; // Set AC room rate
        }
        else if (roomCategory.equals("Non-AC")) {
            roomRent = 2500; // Set non-AC room rate
        }
        else if (roomCategory.equals("Deluxe")) {
            roomRent = 5000; // Set deluxe room rate
        }
        else {
            roomRent = 0000; // Invalid room type, set rate to 0
        }

        int num_of_days = booking.getDuration();
        return roomRent * num_of_days;
    }

    public void makePayment() {
        isPaid = true;
        System.out.println(payment_amount + " for booking number" + booking.getBookingID() + "is successful");
    }
}
