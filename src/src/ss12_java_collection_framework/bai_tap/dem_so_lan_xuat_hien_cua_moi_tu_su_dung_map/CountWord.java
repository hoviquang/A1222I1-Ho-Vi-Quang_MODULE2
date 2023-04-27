package ss12_java_collection_framework.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_su_dung_map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> wordMap = new HashMap<>();
        System.out.println("Nhập chuỗi cần đếm :");
        String str = sc.nextLine();
        String[] strArr = str.split("");
        for(int i=0;i<strArr.length;i++) {
            if(wordMap.containsKey(strArr[i])) {
                int newCount = wordMap.get(strArr[i]) +1;
                wordMap.put(strArr[i], newCount);
            }else {
                wordMap.put(strArr[i], 1);
            }
        }
        for(String key: wordMap.keySet()) {
            System.out.println(key + " - "+  wordMap.get(key));
        }
    }
}
