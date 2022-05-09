import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số tiền cần chuyển đổi:");
        double usd=sc.nextDouble();
        System.out.println("Nhập tỉ giá:");
        double tigia = sc.nextDouble();
        double quydoi= usd*tigia;
        System.out.println(" Số tiền VNĐ là: " + quydoi);
    }
}
