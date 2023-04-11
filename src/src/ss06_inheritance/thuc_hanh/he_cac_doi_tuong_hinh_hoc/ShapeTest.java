package ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

import ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
