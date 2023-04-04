package ss04_class_object.bai_tap;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "Yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan(2, false , 5 , "Blue");
        System.out.println(fan2);
    }
}
