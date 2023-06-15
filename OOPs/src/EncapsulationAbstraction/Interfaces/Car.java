package EncapsulationAbstraction.Interfaces;

public class Car implements Engine, Brake, Media{

    @Override
    public void brake() {
        System.out.println("Normal Brake");
    }

    @Override
    public void start() {
        System.out.println("It start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("It stop like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("It accelerate like a normal car");
    }
}
