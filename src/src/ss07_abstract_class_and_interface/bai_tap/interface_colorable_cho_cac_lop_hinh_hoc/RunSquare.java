package ss07_abstract_class_and_interface.bai_tap.interface_colorable_cho_cac_lop_hinh_hoc;

import ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Square;

public class RunSquare {
    public static void main(String[] args) {
        Colorable[] colorables = new Colorable[2];
        colorables[0] = new Square(5.0);
        colorables[1] = new Square(7.0, 7.0 , "Red", true);


    }
}