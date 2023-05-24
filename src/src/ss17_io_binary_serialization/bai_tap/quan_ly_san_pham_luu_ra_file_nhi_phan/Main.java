package ss17_io_binary_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String path = "D:\\CODEGYM\\MODULE2\\src\\src\\ss17_io_binary_serialization\\bai_tap\\quan_ly_san_pham_luu_ra_file_nhi_phan\\abc.txt";
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        while (true) {
            System.out.println("1.Nhập sản phẩm");
            System.out.println("2.In sản phẩm trong file");
            System.out.println("3.Lưu sản phẩm");
            System.out.println("4.Quit");
            System.out.print("Nhập lựa chọn : ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    enterProduct(products,sc);
                    break;
                case 2:
                    displayProducts(readDataFromFile(path));
                    break;
                case 3:
                    writeToFile(path, products);
                    break;

                default:
                    break;
            }

        }
    }
    public static void enterProduct(List<Product> products , Scanner sc) {
        System.out.println("Nhập Id Sản phẩm : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Tên Sản phẩm : ");
        String name = sc.nextLine();
        System.out.println("Nhập Hãng Sản Xuất : ");
        String manufacturer = sc.nextLine();
        System.out.println("Nhập Giá : ");
        int price = Integer.parseInt(sc.nextLine());
        products.add(new Product(id, name, manufacturer, price));

    }
    public static void displayProducts(List<Product> products) {
        for(Product product:products) {
            System.out.println(product);
        }
    }
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{;
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            products = (List<Product>) ois.readObject();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
