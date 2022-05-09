import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số năm:");
        int year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf(year + " là năm nhuận");
                } else {
                    System.out.printf(year + " không phải là năm nhuận");
                }
            } else {
                System.out.printf(year + " là năm nhuận");
            }
        } else {
            System.out.printf(year + " không phải là năm nhuận");
        }
    }
        }
