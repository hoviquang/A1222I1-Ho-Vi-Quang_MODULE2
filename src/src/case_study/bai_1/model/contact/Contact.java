package case_study.bai_1.model.contact;

public class Contact {
    private int idContact;
    private int idBooking;
    private double deposit;
    private double totalPrice;
    private int idCustomer;

    public Contact(int idContact, int idBooking, double deposit, double totalPrice, int idCustomer) {
        this.idContact = idContact;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPrice = totalPrice;
        this.idCustomer = idCustomer;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "idContact=" + idContact +
                ", idBooking=" + idBooking +
                ", deposit=" + deposit +
                ", totalPrice=" + totalPrice +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
