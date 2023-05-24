package case_study.bai_1.service.impl;

import case_study.bai_1.model.person.Customer;
import case_study.bai_1.service.interfacee.CustomerService;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> listCustomer = new LinkedList<>();
    private static Scanner input = new Scanner(System.in);

    @Override
    public void display() {
        for(Customer customer : listCustomer){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id của Khác hàng");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên của Khác hàng");
        String name = input.nextLine();
        System.out.println("Nhập ngày sinh của Khác hàng");
        String dateOfBirth = input.nextLine();
        System.out.println("Nhập giới tính của Khác hàng");
        String sex = input.nextLine();
        System.out.println("Nhập Số CMND của Khác hàng");
        int idNO = Integer.parseInt(input.nextLine());
        System.out.println("Nhập Số điện thoại của Khác hàng");
        double phoneNumber = Double.parseDouble(input.nextLine());
        System.out.println("Nhâp địa chỉ của Khác hàng");
        String address = input.nextLine();
        System.out.println("Nhập Email của Khác hàng");
        String email = input.nextLine();
        System.out.println("Nhập loại khách hàng");
        String typeCustomer = input.nextLine();
        Customer customer = new Customer(id,
                name,
                dateOfBirth,
                sex,
                idNO,
                phoneNumber,
                address,
                email,
                typeCustomer);
        listCustomer.add(customer);
    }

    @Override
    public void edit() {
        Scanner input = new Scanner(System.in);
        int id = Integer.parseInt(input.nextLine());
        for(Customer customer : listCustomer){
            if(customer.getId() == id){
                System.out.println("Hãy sửa lại id của Khách hàng này");
                customer.setId(Integer.parseInt(input.nextLine()));
                System.out.println("Hãy sửa lại tên của Khách hàng này");
                customer.setName(input.nextLine());
                System.out.println("Hãy sửa lại ngày sinh của Khách hàng này");
                customer.setDateOfBirth(input.nextLine());
                System.out.println("Hãy sửa lại giới tính của Khách hàng này");
                customer.setSex(input.nextLine());
                System.out.println("Hãy sửa lại số CMND của Khách hàng này");
                customer.setIdNo(Integer.parseInt(input.nextLine()));
                System.out.println("Hãy sửa lại số điện thoại của Khách hàng này");
                customer.setPhoneNumber(Double.parseDouble(input.nextLine()));
                System.out.println("Hãy sửa lại địa chỉ của Khách hàng này");
                customer.setAddress(input.nextLine());
                System.out.println("Hãy sửa lại email của Khách hàng này");
                customer.setEmail(input.nextLine());
                System.out.println("Hãy sửa lại loại khách hàng của khách hàng này");
                customer.setTypeCustomer(input.nextLine());
            }
        }

    }

    @Override
    public void delete() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id của khách hàng muốn xóa");
        int id = Integer.parseInt(input.nextLine());
        for(Customer customer : listCustomer){
            if(customer.getId() == id){
                listCustomer.remove(customer);
                System.out.println("Khách hàng này đã bị xóa");
            } else{
                System.out.println("id này không tồn tại để xóa");
            }
        }

    }
}