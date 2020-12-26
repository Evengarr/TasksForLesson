package Lesson6;

public class Count {
    private int countAnimal;
    private int countCat;
    private int countDog;
    private int countHamster;

    public void numberOfDogs() {
        countDog++;
    }

    public void numberOfCats() {
        countCat++;
    }

    public void numberOfAnimals() {
        countAnimal++;
    }

    public void numberOfHamster() {
        countHamster++;
    }

    public int getCountAnimal() {
        return countAnimal;
    }

    public int getCountCat() {
        return countCat;
    }

    public int getCountDog() {
        return countDog;
    }

    public int getCountHamster() {
        return countHamster;
    }
}
