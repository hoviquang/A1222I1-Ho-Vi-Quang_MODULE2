package ss18_string.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {

    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            String nameClass = CLASS_NAME;
            Pattern pattern = Pattern.compile(nameClass);
            System.out.println("Nhập tên lớp học để kiểm tra: ");
            String yourNameClass = input.nextLine();
            Matcher matcher = pattern.matcher(yourNameClass);
            if(matcher.matches()){
                System.out.println("Tên lớp học hợp lệ ");
            }else {
                System.out.println("Tên lớp học không hợp lệ ");
            }

        }
    }
}
