package ss04_class_object.bai_tap;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a");
        double a = input.nextDouble();
        System.out.println("Enter b");
        double b = input.nextDouble();
        System.out.println("Enter c");
        double c = input.nextDouble();

        QuadraticEquation quadraEquation = new QuadraticEquation(a, b ,c);
        System.out.println(quadraEquation.getDiscriminants());
//        System.out.println(quadraEquation.getRoot1());
    }
}
