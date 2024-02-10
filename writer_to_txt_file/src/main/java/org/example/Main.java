package org.example;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in); // класс для считывания с клавиатуры
        in.useLocale(Locale.US); // установка локации
        PrintWriter pw = new PrintWriter("newfile.txt");
        System.out.print("Введите сколько студентов вы будите заносить: ");
        int count = in.nextInt();
        for (int i = 1; i <= count; i++) { // цикл, где запрашиваются данные о студентах
            in.nextLine();
            System.out.print("\nВведите имя " + i + " студента: ");
            String name = in.nextLine();
            System.out.print("\nВведите возраст " + i + " студента: ");
            int age = in.nextInt();
            System.out.print("\nВведите средний балл " + i + " студента: ");
            double average_score = in.nextDouble();
            pw.println(name + " " +  age + " " + average_score); // заносится студень в txt
        }
        pw.close();
    }
}
