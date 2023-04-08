package ss06_inheritance.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    public double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " radius = " + getRadius() +
                " - height=" + height +
                " - volume=" + getVolume() +
                '}';
    }
}
