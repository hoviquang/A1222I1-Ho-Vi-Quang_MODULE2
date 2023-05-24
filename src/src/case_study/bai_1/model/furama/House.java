package case_study.bai_1.model.furama;

public class House extends Facility {
    private String standardRoom;
    private int numberOfFloors;

    public House(String nameOfService,
                 double areaUse,
                 double price,
                 int maxNumber,
                 String standardRoom,
                 int numberOfFloors) {
        super(nameOfService, areaUse, price, maxNumber) ;
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "nameOfService='" + getNameOfService() + '\'' +
                ", AreaUse=" + getAreaUse() +
                ", price=" + getPrice() +
                ", maxNumber=" + getMaxPeople() +
                "standardRoom=" + standardRoom + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}