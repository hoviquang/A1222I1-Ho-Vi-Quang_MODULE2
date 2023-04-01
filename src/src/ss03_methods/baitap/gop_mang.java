package ss03_methods.baitap;

import java.util.Arrays;

public class gop_mang {
    public static void main(String[] args) {
        String[] animals1 = {"dog", "cat", "chicken"};
        String[] animals2 = {"bird", "mouse"};
        String[] allAnimals = new String[animals1.length + animals2.length];

        int i = 0;
        for (String element : animals1){
            allAnimals[i] = element;
            i++;
        }

        for (String element : animals2 ){
            allAnimals[i] = element;
            i++;
        }

        System.out.println("Array 1 : " + Arrays.toString(animals1));
        System.out.println("Array 2 : " + Arrays.toString(animals2));
        System.out.println(Arrays.toString(allAnimals));
    }

}