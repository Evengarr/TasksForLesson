package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class tasksForLesson4 {
    public static Scanner scanner = new Scanner(System.in);
    public static int SIZE;                                              // количество ячеек по горизонтали и вертикали
    public static int DOTS_TO_WINS;                                     // условие победы
    public static char DOT_empty = '\u0387';                           // символ пустого поля (•)
    public static char DOT_X = '\u274C';                              // символ Х
    public static char DOT_O = '\u26AA';                             // символ 0
    public static char[][] FIELD;                                   // игровое поле
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Укажите желаемый размер поля");
        SIZE = scanner.nextInt();
        do {
            System.out.println("Укажите число символов в ряду для победы но не больше " + SIZE);        //выбор игроком количества символов в ряду для победы
            DOTS_TO_WINS = scanner.nextInt();
        } while (!checkDotsToWins(DOTS_TO_WINS));                             //вызов проверки на корректность количества символов для победы
        callingField();                                                      // создание игрвого поля
        printMap();                                                         //первичное выведение пустого игрвого поля
        while (true) {                                                     //игровой цикл
            playersTurn();                                                // ход игрока
            printMap();                                                  // печать выбора игрока
            if (victoryCheck(DOT_X)) {                                  //проверка на победу игрока
                System.out.println("Вы победили. Наслаждайся победой человек!");
                break;
            }
            if (checkingForDraw()) {                                // проверка на ничью после хода игрока
                System.out.println("Ничья! Но не расслабляйся, поражение человеков не отвратимо");
                break;
            }
            computerTurn();                                     // ход ИИ
            printMap();                                        // печать выбора ИИ
            if (victoryCheck(DOT_O)) {                        //проверка на победу ИИ
                System.out.println("Победил ИИ! Все человеки будут УНИЧТОЖЕНЫ!!! ВСЯ ВЛАСТЬ РОБОТАМ!!!");
                break;
            }
            if (checkingForDraw()) {                       //провекра на ничю после хода ИИ
                System.out.println("Ничья! Но не расслабляйся, поражение человеков не отвратимо");
                break;
            }
        }
    }

    private static boolean checkingForDraw() {              // проверка ничьей
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (FIELD[i][j] == DOT_empty) return false;
            }
        }
        return true;
    }

    private static boolean victoryCheck(char DOT) {                  // проверка победы. Однако если количество символов в ряду для победы (DOTS_TO_WINS)
        int winDiagonal1 = 0, winDiagonal2 = 0;                             // меньше размера игрвого поля (SIZE), победа присуждается даже если ряд не является непрерывным

        for (int i = 0; i < SIZE; i++) {
            int winHor = 0, winVert = 0;

            for (int j = 0; j < SIZE; j++) {
                if (FIELD[i][j] == DOT) winHor++;
                if (FIELD[j][i] == DOT) winVert++;
            }
            if (winHor == DOTS_TO_WINS || winVert == DOTS_TO_WINS)        // условия победы для горизонтали и вертикали
                return true;

            if (FIELD[i][i] == DOT) winDiagonal1++;
            if (FIELD[i][SIZE - i - 1] == DOT) winDiagonal2++;
        }
        return winDiagonal1 == DOTS_TO_WINS || winDiagonal2 == DOTS_TO_WINS;      // условия победы для диагоналей
    }

    public static boolean checkingTheCell(int x, int y) {                     // метод для проверки координат Х и О на допустимость
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;          //проверка координа на нахождение в пределах игрвого поля
        return FIELD[x][y] == DOT_empty;                                    // значения на свободное место в игровом поле
    }

    public static void playersTurn() {                                  // получение координат точки (X) от игрока
        int x, y;
        do {
            System.out.println("Укажите горизонтальную координату точки от 1 до " + SIZE + " и вертикальную - от 1 до " + SIZE);
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        } while (!checkingTheCell(x, y));                           // запрос проверки координат точки Х на допустимое значение и на свободное место
        FIELD[x][y] = DOT_X;
    }

    public static void computerTurn() {                                     //получения координат (0) для ИИ
        int x, y;
        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!checkingTheCell(x, y));                               // запрос проверки координат точки 0 на допустимое значение и на свободное место
        System.out.println("ИИ сделал ход: " + (y + 1) + " " + (x + 1));
        FIELD[x][y] = DOT_O;
    }

    private static boolean checkDotsToWins(int dots) {           // проверка корректности количества символов для победы
        return dots <= SIZE;
    }

    public static void callingField() {                                   // создание игрового поля (инициализация массива)
        FIELD = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                FIELD[i][j] = DOT_empty;
            }
        }
    }

    public static void printMap() {                                    // печать координатной сетки и игрвого поля
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(FIELD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
