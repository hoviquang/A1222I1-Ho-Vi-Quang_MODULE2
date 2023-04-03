package ss02_array_loop.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        boolean check;
        String result = " ";
        while (count < 20) {
            check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                result += n + " ,";
                count++;
            }
            n++;
        }
        System.out.print(result);
    }
}