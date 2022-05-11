import java.util.Scanner;

public class Chuyendoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=-1;
        while (choice!=0){

            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            float b=0;
            System.out.println("Nhập nhiệt độ: ");
            float a=sc.nextFloat();
            switch (choice) {
                case 1:
                    b=(a-32)*5/9;
                    System.out.println(b);
                    break;
                case 2:
                    b=a*9/5+32;
                    System.out.println(b);
                    break;
                case 0:
                    break;
            }
    }
}}
