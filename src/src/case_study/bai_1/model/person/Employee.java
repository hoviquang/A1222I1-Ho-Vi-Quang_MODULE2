package case_study.bai_1.model.person;

public class Employee extends Person{
    private String level;
    private String job;
    private double salary;

    public Employee(int id,
                    String name,
                    String dateOfBirth,
                    String sex,
                    int idNo,
                    double phoneNumber,
                    String address,
                    String email,
                    String level,
                    String job,
                    double salary) {
        super(id, name, dateOfBirth, sex, idNo, phoneNumber, address, email);
        this.level = level;
        this.job = job;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", sex='" + getSex() + '\'' +
                ", idNo=" + getIdNo() +
                ", phoneNumber=" + getPhoneNumber() +
                ", address='" + getAddress() + '\'' +
                ", email='" + getEmail() + '\'' +
                "level='" + getLevel() + '\'' +
                ", job='" + getJob() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}