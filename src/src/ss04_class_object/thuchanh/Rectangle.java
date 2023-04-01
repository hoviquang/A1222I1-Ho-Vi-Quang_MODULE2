package ss04_class_object.thuchanh;

public class Rectangle {
    double width, height;
    public Rectangle(){
    }
    public Rectangle( double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return "Rectangle have a height is: " + height + " and width is: " + width;
    }

}


