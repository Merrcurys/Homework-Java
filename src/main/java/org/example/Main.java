package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        // массивы
        String[] clocks = {"Casio", "Tisot", "Rolex", "Apple", "Samsung"};
        String[][] clocksBrands = {{clocks[0], "Pavel"}, {clocks[1], "Oak"}, {clocks[2], "Submariner"},
                {clocks[2], "Datejust"}, {clocks[2], "Explorer"}, {clocks[3], "Watch 3"}, {clocks[4], "whale"}};
        ArrayList<Object> orders = new ArrayList<>();
        int choice;

        System.out.println("МАГАЗИН ПАПА КУПИ");

        do {
            System.out.println("1. Создать заказ");
            System.out.println("2. Покинуть магазин 'Папа купи'");
            choice = in.nextInt();
            if (choice == 2) { break; }

            for (int i = 0; i < clocksBrands.length; i++) {
                System.out.println((i + 1) + ". " + clocksBrands[i][0] + " - " + clocksBrands[i][1]);
            }
            // сбор данных
            System.out.println("Выберите марку желаемых часов: ");
            int clock = in.nextInt(); in.nextLine();
            System.out.println("Введите ФИО: ");
            String snp = in.nextLine();
            System.out.println("Введите email: ");
            String email = in.nextLine();
            System.out.println("Ввведите номер телефона: ");
            String number = in.nextLine();
            System.out.println("Ввведите кол-во: ");
            int count = in.nextInt(); in.nextLine();
            // добавление в заказа в orders
            Object[] order = {snp, email, number, clocksBrands[clock - 1], count};
            orders.add(Arrays.asList(order));
            // вывод заказа
            System.out.println("ЗАКАЗЧИК:\n" +
                    "ФИО: " + order[0] +
                    "\nПочта: " + order[1] +
                    "\nТелефон: " + order[2] +
                    "\n\nТОВАР:\n" +
                    "Марка: " + ((String[]) order[3])[0] +
                    "\nМодель: " + ((String[]) order[3])[1] +
                    "\nКол-во: " + order[4] + "\n");

        } while (true);
    }
}