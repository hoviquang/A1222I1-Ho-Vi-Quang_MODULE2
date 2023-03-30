package ss02_array_loop.baitap;

public class hien_thi_cac_so_nguyen_to_nho_hon_100 {
    static String prime = " ";
    public static void main(String[] args){
//        String prime = " ";
        for(int i =2; i < 100 ; i++){
            int count = 0;
            for(int j = 1; j<=i ;j++){
                if(i % j == 0){
                    count = count + 1;
                }
            }
            if(count == 2){
                prime += i + ", ";
            }
        }
        System.out.print(prime);
    }
}
