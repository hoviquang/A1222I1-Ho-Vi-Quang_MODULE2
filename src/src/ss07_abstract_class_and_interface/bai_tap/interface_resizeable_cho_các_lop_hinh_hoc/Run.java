package ss07_abstract_class_and_interface.bai_tap.interface_resizeable_cho_các_lop_hinh_hoc;
import ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;
import ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;
import ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Square;
import ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;



public class Run {
    public static void main(String[] args) {
//        Resizeable[] resizeables = new Resizeable[3];
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1.4);
        shapes[1] = new Square(4.5);
        shapes[2] = new Rectangle(3.5, 6.0);

        System.out.println("Before change");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        for (Shape shape : shapes){
//            System.out.println(shape.);
        }

    }
}
