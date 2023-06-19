package ss02_array_loop.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        int choice1 = 1;
        while (choice != 0) {
            System.out.println("----------MENU----------");
            System.out.println("1. Draw the Rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The Rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("The right triangle ");
                    int n = 5; // Chiều dài và chiều rộng của tam giác
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    int m = 5; // Chiều dài và chiều rộng của tam giác
                    for (int i = m; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;


                case 3:
                    System.out.println("The isosceles triangle ");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 5 - i; j >= 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.print("No choice");

            }
        }
    }
}
