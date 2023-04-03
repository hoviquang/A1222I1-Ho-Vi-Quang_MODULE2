package ss04_class_object.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle : "+ rectangle.display());
        System.out.println("Area is: "+rectangle.getArea());
        System.out.println("Perimeter is: "+rectangle.getPerimeter());
    }
}