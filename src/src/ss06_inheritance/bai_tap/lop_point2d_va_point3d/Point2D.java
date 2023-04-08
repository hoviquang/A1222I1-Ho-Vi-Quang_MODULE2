package ss06_inheritance.bai_tap.lop_point2d_va_point3d;

public class Point2D {
    public float x ;
    public float y;
    public Point2D(){}
    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float xy[] = {x,y};
        return xy;
    }

    public String toString() {
        return "Print2D{" +
                "X = " + x +
                "Y = " + y +
                "}";
    }
}
