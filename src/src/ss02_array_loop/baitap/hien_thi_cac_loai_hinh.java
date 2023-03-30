package ss02_array_loop.baitap;
import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the Square");
            System.out.println("3. Draw the Rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The Rectangle");
                    for(int e=0;e<6;e++){
                        for(int f=0;f<=e;f++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("The Square");
                    for(int i = 0; i < 5; i++) {
                        for(int j = 0; j < 5; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("The Rectangle");
                    for(int g = 0; g < 3; g++) {
                        for(int h=0 ; h < 6; h++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("No choice");
            }
        }
    }
}
