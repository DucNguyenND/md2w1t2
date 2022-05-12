import java.util.Scanner;

public class QuadraticEquation {
        private double a;
        private double b;
        private double c;
        public QuadraticEquation(double a,double b, double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    public double getDiscriminant(){
        double delta= this.b*this.b - 4*this.a*this.c;
        return delta;
    }
    public double getRooot1(){
        double r1=(-this.b+ Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
        return r1;
    }
    public double getRooot2(){
        double r2=(-this.b-Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
        return r2;
    }
    public void show(){
            if (this.getDiscriminant()>0){
                System.out.println("Phương trình có nghiệm là: " + getRooot1() + " và " + getRooot2());
            }
            else if (this.getDiscriminant()==0){
                System.out.println("Ptrinh có nghiệm là: "+ getRooot1());
            }
            else System.out.println("Ptrinh vô nghiệm");
    }
}
