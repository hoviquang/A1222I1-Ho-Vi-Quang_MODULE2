package case_study.bai_1.controller;

import case_study.bai_1.service.impl.CustomerServiceImpl;
import case_study.bai_1.service.impl.EmployeeServiceImpl;
import case_study.bai_1.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static void displayMenu() {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4 :
                    displayBookingManagement();
                    break;
                case 5 :
                    displayPromotionManagement();
                case 6 :
                    System.exit(0);

            }
        }
    }
    //1
    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Return main menu");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    employeeService.delete();
                    break;
                case 5:
                    displayMenu();
                    break;

            }
        }
    }

    //2
    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customer");
            System.out.println("2. Add new Customer");
            System.out.println("3. Edit Customer");
            System.out.println("4. Delete Customer");
            System.out.println("4. Return main menu");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    customerService.delete();
                case 5:
                    displayMenu();
                    break;
            }
        }
    }

    //3
    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    displayMenuAddNewFacility();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    break;
                case 4:
                    displayMenu();
                    break;
            }
        }
    }

    //4
    public static void displayBookingManagement() {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking ");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contacts");
            System.out.println("4. Display list contacts");
            System.out.println("5. Edit contacts");
            System.out.println("6. Return menu");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
            }
            break;
        }
    }

    //5
    public static void displayPromotionManagement() {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customer use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return menu");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                case 2:
                case 3:
            }
            break;
        }
    }

    public static void displayMenuAddNewFacility() {
        Scanner input = new Scanner(System.in);
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Return facility Menu");
            switch (input.nextInt()) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    displayFacilityMenu();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
