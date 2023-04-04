package ss03_methods.bai_tap;

import java.util.Scanner;

public class DemSoKiTuXuatHienTrong1Chuoi {
    public static void main(String[] args){
        String word ;
        int count = 0 ;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        word = input.nextLine();

        for(int i = 0 ; i < word.length() ; i++){
            count++;
            if(Character.isSpace(word.charAt(i))){
                count--;
            }
        }
        System.out.println("Number of characters in string is " + count);

    }
}


