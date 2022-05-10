import java.util.Scanner;

public class Ucln {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số a:");
        int a=Math.abs(sc.nextInt());
        System.out.println("Nhập số b:");
        int b=Math.abs(sc.nextInt());
        int ucln=0;
        for (int i = a; i >0; i--) {
            if (a%i==0 && b%i==0) {
                ucln=i;
                break;
            }
            }
        System.out.println("Ước chung lớn nhất là :"+ucln);
        }
    }
