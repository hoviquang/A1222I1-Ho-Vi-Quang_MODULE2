package ss18_string.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_NUMBER = "^\\([0-9]{2}\\)\\-\\((0)[0-9]{9}\\)$";

    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            String nameClass = PHONE_NUMBER;
            Pattern pattern = Pattern.compile(nameClass);
            System.out.println("Nhập số điện thoại để kiểm tra: ");
            String yourNameClass = input.nextLine();
            Matcher matcher = pattern.matcher(yourNameClass);
            if(matcher.matches()){
                System.out.println("Số điện thoại hợp lệ ");
            }else {
                System.out.println("Số điện thoại không hợp lệ ");
            }

        }
    }
}
