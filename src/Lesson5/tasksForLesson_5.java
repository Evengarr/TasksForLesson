package Lesson5;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 * <p>
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class tasksForLesson_5 {

    public static void main(String[] args) {

        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Иванов Иван Иванович", "инженер", "anf@gmail.com", 819563246, 35000, 30);
        workArray[1] = new Worker("Семенов Семен Семенович", "слесарь", "sadfgsdg@gmail.com", 865235246, 35000, 45);
        workArray[2] = new Worker("Петров Петр Петрович", "токарь", "sdgsg@gmail.com", 465415494, 40000, 55);
        workArray[3] = new Worker("Николаев Николай Николаевич", "сантехник", "k;l'k;ol@gmail.com", 565487454, 25000, 20);
        workArray[4] = new Worker("Сергеев Сергей Сергеевич", "охранник", "vxcbvefb@gmail.com", 123654564, 25000, 45);

        for (int i = 0; i < 5; i++) {
            if (workArray[i].getAge() >= 40) {
                workArray[i].displayInformation();
            }
        }
    }
}
