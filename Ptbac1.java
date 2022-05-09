import java.util.Scanner;

public class Ptbac1 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 1");
        System.out.println(" Điền các chỉ số:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào số c:");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Nghiệm của phương trình là: x= " + answer);
        } else if (b == c) {
            System.out.println("Phương trình có vô số nghiệm");
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
