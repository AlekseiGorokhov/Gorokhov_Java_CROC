package ru.croc.task1;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите X для A:");
        Scanner scannerAX = new Scanner(System.in);
        double ax;
        ax = scannerAX.nextDouble();
        System.out.println("Введите Y для A:");
        Scanner scannerAY = new Scanner(System.in);
        double ay;
        ay = scannerAY.nextDouble();
        System.out.println("Введите X для B:");
        Scanner scannerBX = new Scanner(System.in);
        double bx;
        bx = scannerBX.nextDouble();
        System.out.println("Введите Y для B:");
        Scanner scannerBY = new Scanner(System.in);
        double by;
        by = scannerBY.nextDouble();
        System.out.println("Введите X для C:");
        Scanner scannerCX = new Scanner(System.in);
        double cx;
        cx = scannerCX.nextDouble();
        System.out.println("Введите Y для C:");
        Scanner scannerCY = new Scanner(System.in);
        double cy;
        cy = scannerCY.nextDouble();
        double a = Math.sqrt(Math.pow((bx - ax),2) + Math.pow((by - ay),2));
        double b = Math.sqrt(Math.pow((cx - ax),2) + Math.pow((cy - ay),2));
        double c = Math.sqrt(Math.pow((cx - bx),2) + Math.pow((cy - by),2));
        //System.out.println("b=" + String.format("%.4f",b));
        double p = (a + b + c)*0.5;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Сторона А = " + a);
        System.out.println("Сторона B = " + b);
        System.out.println("Сторона C = " + c);
        System.out.println("Полупериметр треугольника равна = " + p);
        System.out.println("Площадь треугольника равна = " + String.format("%.1f", s));
        if (a == 0 | b == 0 | c == 0) {
            System.out.println("Неправильно заданы координаты!");
        } else {
            System.out.println("Площадь треугольника = " + String.format("%.4f", s));
        }
    }
}