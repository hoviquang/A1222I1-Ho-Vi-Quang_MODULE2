package ss03_methods.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    static int number ;
    static int index;
    public static void main(String[] args){
        int i = 0;
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int[] arrAdd = new int[arr.length + 1];

        System.out.println("Enter index want to add a element: ");
        index = input.nextInt();
        System.out.println("Enter name to add: ");
        number = input.nextInt();

        for(int element : arr){
            arrAdd[i] = element;
            i++;
        }

        System.out.println("Array before add : " + Arrays.toString(arr));

        if(index >= -1 && index <= arrAdd.length){
            for(int j = arrAdd.length-1; j > index ; j--){
                arrAdd[j] = arrAdd[j - 1];
            }
        } else {
            System.out.println("This index does not exist");
        }
        arrAdd[index] = number;

        System.out.println("Array after add : " + Arrays.toString(arrAdd));
    }
}
