package ss05_access_modifier_static_method_static_property.bai_tap.xay_dung_lp_chi_ghi;

public class Test {
    public static void main(String[] args){
        Student student = new Student();

        System.out.println("Name before change : " + student.getName() );
        System.out.println("Classes before change : " + student.getClasses() );
        student.setName("Hồ Vĩ Quang");
        student.setClasses("A1222I1");
        System.out.println("Name after change : " +  student.getName());
        System.out.println("Classes after change : " +  student.getClasses());
    }
}
