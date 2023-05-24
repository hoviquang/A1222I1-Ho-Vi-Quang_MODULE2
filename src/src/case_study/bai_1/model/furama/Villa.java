package case_study.bai_1.model.furama;

public class Villa extends Facility {
    private String standardRoom;
    private double areaPool ;
    private int numberOfFloors;

    public Villa(String nameOfService,
                 double areaUse,
                 double price,
                 int maxPeople,
                 String standardRoom,
                 double areaPool,
                 int numberOfFloors) {
        super(nameOfService, areaUse, price, maxPeople);
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }


    @Override
    public String toString() {
        return "Villa{" +
                "nameOfService='" + getNameOfService() + '\'' +
                ", AreaUse=" + getAreaUse() +
                ", price=" + getPrice() +
                ", maxPeople=" + getMaxPeople() +
                "standardRoom=" + standardRoom + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
