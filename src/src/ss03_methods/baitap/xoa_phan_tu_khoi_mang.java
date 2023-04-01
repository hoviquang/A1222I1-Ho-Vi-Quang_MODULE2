package ss03_methods.baitap;
import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    static int index;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Array : " + Arrays.toString(arr));

        System.out.println("Enter the element want to delete");
        int x = input.nextInt();

        for(int i = 0 ; i < arr.length ; i++ ){
            if( x == arr[i] ){
                index = i;
            }
        }
        if(index > 0) {
            for(int j = index; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length-1] = 0;
        } else {
            System.out.println("This element is not here");
        }
        System.out.println("Array after delete a element " + Arrays.toString(arr));
    }
}
