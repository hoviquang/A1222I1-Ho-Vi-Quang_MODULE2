package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class OperatorExpression    {
    public static void main(String[] args) {
        float width;
        float height;
//su dung toan tu
        Scanner scanner = new Scanner(System.in); //Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat(); //Nhap chieu rong

        System.out.println("Enter height: ");
        height = scanner.nextFloat(); //Nhap chieu dai

        float area = width*height;
        System.out.println("Area is: " +area);
    }

}
