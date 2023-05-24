package ss16_io_text_file.bai_tap.copy_file_text;

import java.util.Scanner;

public class RunCopyFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReadAndWrite tien = new ReadAndWrite();
//        System.out.println("Nhập đường dẫn để đọc file");
//        tien.readFile(input.nextLine());

        System.out.println("Nhập đường dẫn của file muốn sao chép");
        String filePath = input.nextLine();
        System.out.println("Nhập đường dẫn của file bạn sao chép đến");
        System.out.println();
        String fileDest = input.nextLine();


        tien.writeFile(filePath, fileDest);

    }
}