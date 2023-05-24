package case_study.bai_1.model.furama;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room(String nameOfService,
                double areaUse,
                double price,
                int maxPeople,
                String freeServiceIncluded) {
        super(nameOfService, areaUse, price, maxPeople);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nameOfService='" + getNameOfService() + '\'' +
                ", AreaUse=" + getAreaUse() +
                ", price=" + getPrice() +
                ", maxPeople=" + getMaxPeople() +
                "freeServiceIncluded=" + getFreeServiceIncluded() + '\'' +
                '}';
    }


}
