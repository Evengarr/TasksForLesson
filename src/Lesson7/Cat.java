package Lesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private final boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(getAppetite(), getName(), isSatiety());
    }
}