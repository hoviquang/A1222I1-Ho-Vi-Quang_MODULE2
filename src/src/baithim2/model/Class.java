package baithim2.model;

import qldt.models.DienThoai;

public  abstract class Person {
    private int code;
    private String name;
    private String dateOfBirth;
    private String sex;
    private String phonenumber;
    private String classId;

    public Person(int code, String name, String dateOfBirth, String sex, String phonenumber, String classId) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.phonenumber = phonenumber;
        this.classId = classId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj==null|| getClass()!=obj.getClass()) return false;
        Person person = (Person) obj;
        return code==person.code;
    }
}
