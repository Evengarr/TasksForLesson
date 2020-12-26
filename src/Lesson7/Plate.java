package Lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.printf("В тарелке %s порций еды. %n%n", food);
    }

    public void decreaseFood(int appetite, String name, boolean satiety) {
        int supp = 0;                                                       //количество добавленной еды
        if (food >= appetite) {
            food -= appetite;
            System.out.printf("%s съедает %s порций еды, сытость: %s. %n%n", name, appetite, true);

        } else {
            System.out.printf("%sу не хватает еды, сытость: %s. ", name, satiety);
            supp += (100 - food);                                   //количество добавленной еды = емкость тарелки (100) минус еда в наличии
            System.out.printf("Пришлось положить еще %s порций, теперь в тарелке %s порций. %n", supp, (food + supp));
            System.out.printf("%s съедает %s порций, сытость: %s. %n%n", name, appetite, true);
            food += supp - appetite;
        }
    }
}