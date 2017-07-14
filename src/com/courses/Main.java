package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        double perimetr, poluperimetr, ploshad;
        System.out.println("Введите длинны сторон треугольника!\n");
        System.out.println("Введите длинну стороны А: ");
        a = in.nextDouble();
        System.out.println("Введите длинну стороны Б: ");
        b = in.nextDouble();
        System.out.println("Введите длинну стороны С: ");
        c = in.nextDouble();
        perimetr = a + b + c;
        System.out.println("Переметри треугольника - " + perimetr);
        poluperimetr = perimetr / 2;
        ploshad = Math.sqrt(poluperimetr*(poluperimetr-a)*(poluperimetr-b)*(poluperimetr-c));
        System.out.println("Площадь треугольника равна - " + ploshad);
    }
}
