package EncapsulationAbstraction.Interfaces;

public interface Engine {
    static final int price = 50_000_000;
    void start();
    void stop();
    void accelerate();
}
