package ss02_array_loop.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    static String prime = " ";
    public static void main(String[] args) {
        for (int i = 2; i < 100 ; i++) {
            int count =0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0){
                    count = count +1;
                }
            }
            if (count == 2){
                prime += i +", ";
            }
        }
        System.out.print(prime);
    }
}
