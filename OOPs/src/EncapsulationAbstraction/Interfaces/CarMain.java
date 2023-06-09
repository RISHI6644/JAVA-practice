package EncapsulationAbstraction.Interfaces;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.stop();
        car.accelerate();

        Engine car2 = new Car();

        car2.start();
        car2.stop();
        car2.accelerate();

        Media car3 = new Car();
        car3.stop();

        NiceCar car4 = new NiceCar();

        car4.start();
        car4.startMusic();
        car4.upgradeEngine();
        car4.start();
    }
}
