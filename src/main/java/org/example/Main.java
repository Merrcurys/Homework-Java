package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // класс для считывания с клавиатуры
        in.useLocale(Locale.US); // установка локации
        final int R = 6371; // радиус земли
        System.out.println("КАЛЬКУЛЯТОР");

        System.out.println("Введите первую долготу :");
        double long1 = Math.toRadians(in.nextDouble());
        System.out.println("Введите первую широту :");
        double lat1 = Math.toRadians(in.nextDouble());

        System.out.println("Введите вторую долготу :");
        double long2 = Math.toRadians(in.nextDouble());
        System.out.println("Введите вторую широту :");
        double lat2 = Math.toRadians(in.nextDouble());

        // расстояние в радианах
        var d = Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));

        System.out.print(d * R); // умножаем расстояние в радианах на километры
    }
}


