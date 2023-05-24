package case_study.bai_1.service.impl;

import case_study.bai_1.model.person.Employee;
import case_study.bai_1.service.interfacee.EmployeeService;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> listEmployee = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public void display() {
        for (Employee employee : listEmployee) {
            System.out.println(employee.toString());
        }
    }


    @Override
    public void addNew() {
        System.out.println("Nhập id của nhân viên");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên của nhân viên");
        String name = input.nextLine();
        System.out.println("Nhập ngày sinh của nhân viên");
        String dateOfBirth = input.nextLine();
        System.out.println("Nhập giới tính của nhân viên");
        String sex = input.nextLine();
        System.out.println("Nhập Số CMND của nhân viên");
        int idNO = Integer.parseInt(input.nextLine());
        System.out.println("Nhập Số điện thoại của nhân viên");
        double phoneNumber = Double.parseDouble(input.nextLine());
        System.out.println("Nhâp địa chỉ của nhân viên");
        String address = input.nextLine();
        System.out.println("Nhập Email của nhân viên");
        String email = input.nextLine();
        System.out.println("Nhập trình độ của nhân viên");
        String level = input.nextLine();
        System.out.println("Nhập Vị trí công việc của nhân viên");
        String job = input.nextLine();
        System.out.println("Nhập mức lương của nhân viên");
        double salary = Double.parseDouble(input.nextLine());
        Employee employee = new Employee(id,
                name,
                dateOfBirth,
                sex,
                idNO,
                phoneNumber,
                address,
                email,
                level,
                job,
                salary);
        listEmployee.add(employee);
    }

    @Override
    public void edit() {
//        Scanner input = new Scanner(System.in);
        int id  = input.nextInt();
        for (Employee employee : listEmployee) {
            if (employee.getSalary() == id) {
                System.out.println("Hãy sửa lại id của nhân viên này");
                employee.setId(Integer.parseInt(input.nextLine()));
                System.out.println("Hãy sửa lại tên của nhân viên này");
                employee.setName(input.nextLine());
                System.out.println("Hãy sửa lại ngày sinh của nhân viên này");
                employee.setDateOfBirth(input.nextLine());
                System.out.println("Hãy sửa lại giới tính của nhân viên này");
                employee.setSex(input.nextLine());
                System.out.println("Hãy sửa lại số CMND của nhân viên này");
                employee.setIdNo(Integer.parseInt(input.nextLine()));
                System.out.println("Hãy sửa lại số điện thoại của nhân viên này");
                employee.setPhoneNumber(Double.parseDouble(input.nextLine()));
                System.out.println("Hãy sửa lại địa chỉ của nhân viên này");
                employee.setAddress(input.nextLine());
                System.out.println("Hãy sửa lại email của nhân viên này");
                employee.setEmail(input.nextLine());
                System.out.println("Hãy sửa lại trình độ của nhân viên này");
                employee.setLevel(input.nextLine());
                System.out.println("Hãy sửa lại vị trí công việc của nhân viên này");
                employee.setJob(input.nextLine());
                System.out.println("Hãy sửa lại lương của nhân viên này");
                employee.setSalary(Double.parseDouble(input.nextLine()));
            }
        }
    }

    @Override
    public void delete() {
//        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id nhân viên bạn muốn xóa");
        int id = input.nextInt();
        for(Employee employee : listEmployee){
            if(employee.getId() == id){
                listEmployee.remove(employee);
                System.out.println("Nhân viên này đã được xóa");
                break;
            } else {
                System.out.println("Nhân viên này không tồn tại");
            }
        }
    }
}
