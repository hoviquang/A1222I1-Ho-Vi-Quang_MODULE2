package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter USD: ");
        double usd = input.nextDouble();
        double vnd = usd * 23000;
        System.out.println(vnd + " VNĐ");
    }
}
