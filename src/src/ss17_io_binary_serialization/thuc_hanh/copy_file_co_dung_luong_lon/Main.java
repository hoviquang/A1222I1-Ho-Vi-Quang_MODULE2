package ss17_io_binary_serialization.thuc_hanh.copy_file_co_dung_luong_lon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingFile(File source , File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest ) throws  IOException{
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập file");
        String source = input.nextLine();
        System.out.println("Nhập địa chỉ file được copy đến");
        String dest = input.nextLine();

        File sourceFile = new File(source);
        File destFile = new File(dest);

        try {
            copyFileUsingFile(sourceFile, destFile);
            System.out.println("File đã được copy thành công");
        } catch (IOException io){
            System.out.println("Không thể copy được");
            System.out.println(io.getMessage());
        }
    }
}