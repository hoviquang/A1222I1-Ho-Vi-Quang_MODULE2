package ss03_methods.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class tinh_tong_duong_cheo_ma_tran_vuong {
    public static void main(String[] args){
        int sum1 = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the edge of matrix");
        int edge = input.nextInt();
        int[][] matrix = new int[edge][edge];

        for(int i = 0; i < edge ; i ++){
            for(int j = 0 ; j < edge ; j ++){
                System.out.println("Enter element at index ["+ i +"]"+"["+j+"]");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        for(int g = 0 ; g < edge ; g ++){
            sum1 += matrix[g][g];
        }


        System.out.println("Total diagonal from left to right = " + sum1);
    }
}