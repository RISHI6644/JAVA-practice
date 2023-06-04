package EncapsulationAbstraction;

public class Customer extends Room{
    int customer_id;
    String customer_name;
    String customer_phone_number;

    public Customer() {
        this.customer_id = 0;
        this.customer_name = "No name";
        this.customer_phone_number = " ";
    }

    public Customer(int customer_id, String customer_name, String customer_phone_number) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_phone_number = customer_phone_number;
    }
}
