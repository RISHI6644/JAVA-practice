package EncapsulationAbstraction.Interfaces;

public class CdPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Start playing the CD");
    }

    @Override
    public void stop() {
        System.out.println("Stop playing the CD");
    }
}
