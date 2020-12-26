package Lesson6;

public class Hamster extends Animal {

    public Hamster(Count counter, String name, int maxSwimming, int maxRunning) {
        super(counter, name, maxSwimming, maxRunning);
        counter.numberOfHamster();
    }

    @Override
    public void run() {
        System.out.format("%s пробежал %s метров %n", getName(), getDistanceRun());
    }

    @Override
    public void swim() {
        System.out.format("%s проплыл %s метров %n", getName(), getDistanceSwimming());
    }
}
