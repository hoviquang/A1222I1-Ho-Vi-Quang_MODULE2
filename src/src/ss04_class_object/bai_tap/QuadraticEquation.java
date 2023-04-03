package ss04_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
  private double a;
  private double b;
  private double c;

  public QuadraticEquation (double a,double b,double c) {
      this.a =a;
      this.b =b;
      this.c =c;
    }
    public double getA(){
      return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminants(){
      double delta ;
      delta = Math.pow(this.b,2) - 4*this.a*this.c;
      return delta;
    }
    public void getRoot1(){
        double root1;
        if (getDiscriminants() > 0) {
            root1 = (-this.b+Math.pow(getDiscriminants(),0.5))/(2*this.a);
        }else if (getDiscriminants() == 0) {
            root1 = (-this.b)/(2*this.a);
        }else {
            System.out.println("The equation has no roots");
        }
    }

    public void getRoot2(){

    }
}
