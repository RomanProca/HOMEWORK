package Classwork;

public class Microwave implements Startable {
    @Override
    public void run() {
        System.out.println("Microwave.run");
    }

    @Override
    public void stop() {
        System.out.println("Microwave.stop");
    }
}
