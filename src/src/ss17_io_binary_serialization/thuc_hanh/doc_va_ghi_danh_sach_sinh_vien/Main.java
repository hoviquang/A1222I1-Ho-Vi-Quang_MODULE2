package ss17_io_binary_serialization.thuc_hanh.doc_va_ghi_danh_sach_sinh_vien;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FILE_STUDENT = "D:\\CODEGYM\\MODULE2\\src\\src\\ss17_io_binary_serialization\\thuc_hanh\\doc_va_ghi_danh_sach_sinh_vien\\student";
    public static final String FILE_DEST = "D:\\CODEGYM\\MODULE2\\src\\src\\ss17_io_binary_serialization\\thuc_hanh\\doc_va_ghi_danh_sach_sinh_vien\\dest";

    public static void writeToString(String filePath, List<Student> studentList) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFormFile(String filePath){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream oos = new ObjectInputStream(fis);
            students = (List<Student>) oos.readObject();
            oos.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Vĩ Quang" , "Đà Nẵng"));
        studentList.add(new Student(2, "Quang hồ" , "Đà Nẵng"));
        studentList.add(new Student(3, "Hồ Quang" , "Hội An"));
        studentList.add(new Student(4, "Hồ Vĩ Quang" , "Huế"));

        writeToString(FILE_DEST, studentList);
        List<Student> studentsData = readDataFormFile(FILE_STUDENT);
        for(Student student : studentsData){
            System.out.println(student);
        }

    }



}