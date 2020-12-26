package Lesson6;

public class Animal {
    private Count counter;
    private String name;
    private int distanceSwimming;
    private int distanceRun;

    public Animal(Count counter, String name, int maxSwimming, int maxRunning) {
        this.counter = counter;
        this.name = name;
        this.distanceSwimming = maxSwimming;
        this.distanceRun = maxRunning;
        counter.numberOfAnimals();
    }

    public Count getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public int getDistanceSwimming() {
        return distanceSwimming;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public void swim() {
        System.out.format("Животное умеет плавть %n");
    }

    public void run() {
        System.out.format("Животное умеет бегать %n");
    }

}

