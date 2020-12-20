package Lesson5;

public class Worker {
    private final String name;
    private final String position;
    private final String email;
    private final long phoneNumber;
    private final int salary;
    private final int age;

    public Worker(String name, String position, String email, long phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void displayInformation() {
        System.out.println("Привет, меня зовут " + name);
        System.out.println("Мне " + age + " лет");
        System.out.println("Моя должность: " + position);
        System.out.println("Моя почта: " + email);
        System.out.println("Моя телефон: " + phoneNumber);
        System.out.println("Я зарабатываю: " + salary);
        System.out.println(" ");
    }
}
