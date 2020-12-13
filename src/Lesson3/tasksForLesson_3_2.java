package Lesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
 * "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
 * "pineapple", "pumpkin", "potato"}.
 * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
 * сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано,
 * компьютер показывает буквы, которые стоят на своих местах.
 * apple – загаданное
 * apricot - ответ игрока
 * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
 * Для сравнения двух слов посимвольно можно пользоваться:
 * String str = "apple";
 * char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
 * Играем до тех пор, пока игрок не отгадает слово.
 * Используем только маленькие буквы.
 */
public class tasksForLesson_3_2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int x = rand.nextInt(words.length - 1);
        String word = words[x];
        /*System.out.println("x: " + x);
        System.out.println("слово: " + word);*/
        System.out.println("Угадайте загаданное слово.");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String userWord = scanner.nextLine();
            if (userWord.equals(word)) {
                System.out.println("Вы отгадали слово: " + word);
                break;
            }
            System.out.print("Неверно. Совпадающие буквы: ");
            for (int i = 0; i < userWord.length() && i < word.length(); i++) {
                char chUserWord = userWord.charAt(i);    //определение символа введенного слова
                char chThoughtWord = word.charAt(i);     //определение символа загаданного слова
                if (chUserWord != chThoughtWord) System.out.print('\u0023');
                else System.out.print(chUserWord);
            }
            for (int i = 0; i < 15 - word.length(); i++) System.out.print('\u0023');
            System.out.println(" ");
        }
    }
}
