package SdNgoaiLe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập cạnh 1");
        int a=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh 2");
        int b=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh 3");
        int c=Integer.parseInt(sc.nextLine());
        Triangle triangle=new Triangle(a,b,c);
        IllegalTriangleException check1=new IllegalTriangleException();
        try {
            check1.check(a,b,c);
        }
        catch (TriangleEdgesException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
