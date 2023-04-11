package ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

import ss07_abstract_class_and_interface.bai_tap.interface_resizeable_cho_các_lop_hinh_hoc.Resizeable;

public class Shape implements Resizeable {
    private String color = "Green";
    private boolean filled = true;

    public Shape(){}

    public Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public boolean isfilled(){
        return this.filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + (isfilled() ? "filled" :" not filled") +
                '}';
    }


    @Override
    public void resize(double percent) {

    }
}

