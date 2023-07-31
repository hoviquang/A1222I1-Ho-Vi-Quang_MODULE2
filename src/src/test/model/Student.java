package model;

public class Student extends model.Person {
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student() {
    }

    public Student (double grade) {
        this.grade = grade;
    }

    public Student(int code, String name, String dateOfBirth, double grade) {
        super(code, name, dateOfBirth);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Mã: " +super.getCode()+", Tên: "+super.getName();

    }
}
