package com.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i++);
        }
        System.out.println();
        int i1= 10;
        for (i1 = 10; i1 >=1; i1--) {
            System.out.print(i1);
        }
        System.out.println();

        // Задание 2

        int k = 5;
        for (k = 5; k <=31; k = k +7) {
            System.out.println("Сегодня пятница" + k + "Необходимо подготовить отчет");
        }

        // Задание 3
        int x = 2022;
        int y = x - 200;
        int z = x + 100;
        for (y = x - 200; y <= x + 100; y = y + 79) {
            System.out.println(y);
        }




    }
}
