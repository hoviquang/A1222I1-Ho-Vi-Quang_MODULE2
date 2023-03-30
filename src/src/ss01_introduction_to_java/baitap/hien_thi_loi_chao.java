package ss01_introduction_to_java.baitap;

import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập tên của bạn");
        String name = input.nextLine();
        System.out.println("Hello " +name);
    }
}
