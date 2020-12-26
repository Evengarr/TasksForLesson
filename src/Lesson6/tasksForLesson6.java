package Lesson6;

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */
public class tasksForLesson6 {
    public static void main(String[] args) {

        Count counter = new Count();
        Animal animal = new Animal(counter, "", 0, 0);

        Cat cat1 = new Cat(counter, "Барсик", 0, 200);
        Cat cat2 = new Cat(counter, "Мурзик", 0, 200);


        System.out.println("Всего животных в наличии: " + animal.getCounter().getCountAnimal());
        System.out.println("Из них");
        System.out.println("котов: " + cat1.getCounter().getCountCat());


        Dog dog = new Dog(counter, "Шарик", 10, 500);
        System.out.println("собак: " + dog.getCounter().getCountDog());

        Hamster hamster = new Hamster(counter, "Хома", 1, 5);
        System.out.println("хомяков: " + hamster.getCounter().getCountHamster());

        animal.run();
        animal.swim();
        cat1.run();
        cat1.swim();
        cat2.run();
        cat2.swim();
        dog.run();
        dog.swim();
        hamster.run();
        hamster.swim();



    }


}
