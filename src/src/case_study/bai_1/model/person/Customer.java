package case_study.bai_1.model.person;

public class Customer extends Person {
    private String typeCustomer;

    public Customer(int id,
                    String name,
                    String dateOfBirth,
                    String sex,
                    int idNo,
                    double phoneNumber,
                    String address,
                    String email,
                    String typeCustomer) {
        super(id, name, dateOfBirth, sex, idNo, phoneNumber, address, email);
        this.typeCustomer = typeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                ", id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", sex='" + getSex() + '\'' +
                ", idNo=" + getIdNo() +
                ", phoneNumber=" + getPhoneNumber() +
                ", address='" + getAddress() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", typeCustomer='" + getTypeCustomer() + '\'' +
                '}';
    }
}
