package case_study.bai_1.service.impl;


import case_study.bai_1.model.furama.Facility;
import case_study.bai_1.model.furama.House;
import case_study.bai_1.model.furama.Room;
import case_study.bai_1.model.furama.Villa;
import case_study.bai_1.service.interfacee.FacilityService;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner input = new Scanner(System.in);

    public void display() {
        for(Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()){ //sai
            System.out.println("Servie " + element.getKey() + " Số lần đã thuê " + element.getValue()) ;

        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập tên dịch vụ :");
        String nameOfService = input.nextLine();
        System.out.println("Nhập diện tích sử dụng (m^2) :");
        double areaUse = Double.parseDouble(input.nextLine());
        System.out.println("Nhập giá (VND) :");
        double price = Double.parseDouble(input.nextLine()) ;
        System.out.println("Nhập số lượng người tối đa :");
        int maxNumber = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tiêu chuẩn phòng :");
        String standardRoom = input.nextLine();
        System.out.println("Nhập diện tích hồ bơi :");
        double areaPool = Double.parseDouble(input.nextLine());
        System.out.println("Nhập số lượng tầng :");
        int numberFloor = Integer.parseInt(input.nextLine());
        Villa villa = new Villa(nameOfService,
                areaUse,
                price,
                maxNumber,
                standardRoom,
                areaPool,
                numberFloor );
        facilityIntegerMap.put(villa, 0);
        System.out.println("Đã thêm 1 villa mới thành công nè");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập tên dịch vụ :");
        String nameService = input.nextLine();
        System.out.println("Nhập diện tích sử dụng :");
        double areaUse = Double.parseDouble(input.nextLine());
        System.out.println("Nhập giá :");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("Nhập số lượng người tối đa :");
        int maxNumber = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tiêu chuẩn phòng :");
        String standardRoom = input.nextLine();
        System.out.println("Nhập số tầng của nhà : ");
        int numberOfFloor = Integer.parseInt(input.nextLine());
        House house = new House(nameService,
                areaUse,
                price,
                maxNumber,
                standardRoom,
                numberOfFloor);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm 1 Nhà mới thành công");
    }

    @Override
    public void addNewRoom() {
//        String nameOfService,
//        double areaUse,
//        double price,
//        int maxNumber,
//        String freeServiceIncluded) {
        System.out.println("Nhập tên dịch vụ : ");
        String nameOfService = input.nextLine();
        System.out.println("Nhập diện tích sử dụng :");
        double areaUss = Double.parseDouble(input.nextLine());
        System.out.println("Nhập giá : ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("Nhập só lượng người tối đa");
        int maxPeople = Integer.parseInt(input.nextLine());
        System.out.println("Nhập dịch vụ miễn phí");
        String freeServiceIncluded = input.nextLine();
        Room room = new Room(nameOfService, areaUss, price, maxPeople, freeServiceIncluded) ;
        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm 1 phòng mới thành công");

    }
}
