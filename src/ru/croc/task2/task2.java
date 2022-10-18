package task2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        double bytes;
        String [] names = new String [] {"B", "KB", "MB", "GB", "TB"};
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        bytes = scanner.nextDouble();
        int count = 0;
        while (bytes >= 1023.99) {
            bytes /= 1024;
            count += 1;
        }
        if(count < 5) {
            System.out.println(String.format("%.1f", bytes) + " " + names[count]);
        }
        else {
            System.out.println("Слишком большое число...");
        }
    }
}