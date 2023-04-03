package ss03_methods.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoOCot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rowspan of array");
        int row = input.nextInt();
        System.out.println("Enter colspan of array ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.println("Enter element at index ["+i+"]"+"["+j+"]");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter colspan to calculator");
        int cal = input.nextInt();
        int sum = 0;
        for(int k = 0 ; k < row ; k++){
            if(cal >=0 && cal < col) {
                sum += matrix[k][cal];
            } else {
                System.out.println("This colspan does not exist");
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Total  = " + sum);
    }
}
