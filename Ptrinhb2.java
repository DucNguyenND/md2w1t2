import java.util.Scanner;

public class Ptrinhb2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào số a");
        double a=sc.nextInt();
        System.out.println("nhập vào số b");
        double b=sc.nextInt();
        System.out.println("nhập vào số c");
        double c=sc.nextInt();
        QuadraticEquation ptb2=new QuadraticEquation(a,b,c);
        ptb2.show();
    }
}
