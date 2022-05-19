package Th;

import java.util.Scanner;

public class MainFizzBuzz {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số bất kỳ:");
        int number= Integer.parseInt(sc.nextLine());
        Readnumber readnumber=new Readnumber();
        System.out.println(readnumber.fizzBuzz(number));
        readnumber.readNumber(number);
    }
}
