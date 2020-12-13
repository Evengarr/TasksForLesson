package Lesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Написать программу, которая загадывает случайное число от 0 до 9
 * и пользователю дается 3 попытки угадать это число.
 * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
 * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */
public class tasksForLesson_3_1 {
    public static void main(String[] args) {
        int choice;
        do {
            int i = 0;
            Random rand = new Random();
            int x = rand.nextInt(10);
            System.out.println("Введите любое число от 0 до 9 включительно:");
            while (i < 3) {
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                if (num == x) {
                    System.out.println("Поздравляю, вы угадали.");
                    break;
                } else System.out.println("Вы не угадали.");
                    if (num > x) System.out.println("Указанное число больше загаданного. Попробуйте еще раз:");
                    else System.out.println("указанное число меньше загаданного. Попробуйте еще раз:");
                i++;
                if (i == 3) System.out.println("Вы проиграли. Число попыток исчерпано.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
        } while (choice == 1);
    }
}


