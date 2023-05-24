package case_study.bai_1.model.furama;

public abstract class Facility {
    private String nameOfService;
    private double AreaUse;
    private double price;
    private int maxPeople;

    public Facility(String nameOfService, double areaUse, double price, int maxPeople) {
        this.nameOfService = nameOfService;
        AreaUse = areaUse;
        this.price = price;
        this.maxPeople = maxPeople;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public double getAreaUse() {
        return AreaUse;
    }

    public void setAreaUse(double areaUse) {
        AreaUse = areaUse;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxNumber) {
        this.maxPeople = maxNumber;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "nameOfService='" + nameOfService + '\'' +
                ", AreaUse=" + AreaUse +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                '}';
    }
}