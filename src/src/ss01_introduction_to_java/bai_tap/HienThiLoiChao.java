package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập tên của bạn");
        String name = input.nextLine();
        System.out.println("Hello " +name);
    }
}
