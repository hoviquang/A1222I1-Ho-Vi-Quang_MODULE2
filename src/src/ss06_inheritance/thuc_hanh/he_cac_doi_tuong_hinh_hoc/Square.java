package ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

import ss07_abstract_class_and_interface.bai_tap.interface_colorable_cho_cac_lop_hinh_hoc.Colorable;
import ss07_abstract_class_and_interface.bai_tap.interface_resizeable_cho_các_lop_hinh_hoc.Resizeable;

public class Square extends Rectangle implements Colorable {
    public double side = 1.0;
    public Square(){};
    public Square(double side){
        super(side, side);
    }
    public Square(double width, double height, String color, boolean filled){
        super(width, height, color, filled);
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double width){
        setSide(width);
    }
    public void setHeight(double height){
        setSide(height);
    }

//    @Override
//    public String toString() {
//        return "A Square width size = " + this.side + ", which is a subclass of Rectangle" + super.toString() ;
//    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " . Whích is a subclass off " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side = this.side + this.side*(percent/100);

    }

    @Override
    public void howToColor() {

    }
}
