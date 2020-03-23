package com.lesson;

import java.util.Scanner;

public class Lesson15 {
    public static int lilliesCount(int days) {
        int c = 1;

        if (days < 1)   {
            return 1;
        }

        if (days > 31)  {
            return 1073741824;
        }

        for (int i = 0; i < days - 1; ++i) {
            c = c * 2;
        }

        return c;
    }

    public static int daysCount(int maxLillies) {
        int currentDay = 1;

        while (lilliesCount(currentDay) < maxLillies / 2) {
            ++currentDay;
        }

        return currentDay;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер пруда в кувшинках (шт): ");
        int n = scanner.nextInt();

        System.out.println("Кувшинки займут половину пруда или больше на день номер " + daysCount(n));


        // TBD: Неплохо бы вынести в отдельную функцию.
        /*
        System.out.print("Введите текущий день: ");
        int n = scanner.nextInt();
        int lc = lilliesCount(n);
        System.out.print("Количество кувшинок в день " + n + " составляет " + lc);
        if (lc % 10 == 1) {
            System.out.println(" штука");
        } else if ((lc % 10 > 2) && (lc % 10 < 5)) {
            System.out.println(" штуки");
        } else {
            System.out.println(" штук");
        }
         */

    }
}
