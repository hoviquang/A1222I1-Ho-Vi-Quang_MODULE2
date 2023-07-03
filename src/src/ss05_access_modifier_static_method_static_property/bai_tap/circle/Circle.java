package ss05_access_modifier_static_method_static_property.bai_tap.circle;

public class Circle {
    private double radius;
    private String color;

    Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea(){
        double area;
        area = Math.PI*Math.pow(this.radius,2);
        return area;
    }
}
