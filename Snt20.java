import java.util.Scanner;

public class Snt20 {
    public static void main(String[] args) {
        int count=0;
        int a=2;
        System.out.println("20 số nguyên tố đầu tiên là:");
        while (count<20){
            boolean check=true;
            for (int i = 2; i <a ; i++) {
                if (a%i==0) {
                    check = false;
                    break;
                }
                }
            if (check) {
                System.out.print(a+" ");
                count++;
            }
            a++;
            }
        }
    }
