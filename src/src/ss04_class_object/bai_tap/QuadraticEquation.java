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
    public double getDiscriminant() {
        double dental = Math.pow(this.getB(),2) - (4*this.getA()*this.getC());
        return dental;
    }
    public double getRoot1() {
        double root1 = (-this.getB() + Math.sqrt(this.getDiscriminant()))/(2*this.getA());
        return root1;
    }
    public double getRoot2() {
        double root2 = (-this.getB() - Math.sqrt(this.getDiscriminant()))/(2*this.getA());
        return root2;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if(qe.getDiscriminant()>0) {
            System.out.println("The equation has two roots "+ qe.getRoot1()+ " and " +qe.getRoot2());
        }else if(qe.getDiscriminant()==0) {
            System.out.println("The equation has one root "+ qe.getRoot1());
        }else {
            System.out.println("The equation has no real roots");
        }

    }
}
