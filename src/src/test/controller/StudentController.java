package controller;

import service.IStudentService;
import service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);


    public static void menu(){

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--------------MENU--------------");
            System.out.println("1. Thêm mới");
            System.out.println("2. Chỉnh sửa");
            System.out.println("3. Hiển thị danh sách");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;

            }
        }
    }
}
