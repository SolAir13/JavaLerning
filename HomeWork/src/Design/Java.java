package Design;

import java.util.Random;
import java.util.Scanner;


class WorkNew {
    static Random rd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String... args) {
        int x = 0;
        int random = rd.nextInt(10);
        System.out.println(random);
        System.out.println("");
        System.out.println("Введите от 0 до 10");
        boolean isWin = false;
        while (x < 3) {
            System.out.println("");
            int number = sc.nextInt();
            if (number > random) {
                System.out.println("Больше! Нужно меньше");
            } else if (number < random) {
                System.out.println("Почти, но меньше! давай еще");
                System.out.println("");
            } else if (random == number) {
                System.out.println("Ты угадал!");
                System.out.println("");
                isWin = true;
                break;
            }
            x++;
        }
        if (isWin) {
            System.out.println("Игра окончена" + "\nХотите продолжить? \nВведите 0 для завершения или 1 для продолжения");
            System.out.println("");
            String user = sc.next();
            if (user.equals("1")) {
                main(null);
                System.out.println("пока");
            }
        } else {
            System.out.println("");
            System.out.println("Ваши попытки закончились!Введите 0 для завершения или 1 для продолжения");
            String user = sc.next();
            if (user.equals("1")) {
                main(null);
                System.out.println("Пока");
            }

        }
    }
}

