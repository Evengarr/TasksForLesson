package Lesson6;

public class Cat extends Animal {
    public Cat(Count counter, String name, int maxSwimming, int maxRunning) {
        super(counter, name, maxSwimming, maxRunning);
        counter.numberOfCats();
    }

    @Override
    public void run() {
        System.out.format("%s пробежал %s метров %n", getName(), getDistanceRun());
    }

    @Override
    public void swim() {
        System.out.format("%s не любит воду %n", getName());
    }
}
