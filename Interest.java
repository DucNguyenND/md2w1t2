import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        int month;
        double goc,totalInterest,interestRate;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số tiền gốc: ");
        goc=sc.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        month=sc.nextInt();
        System.out.println("Nhập lãi suất: ");
        interestRate=sc.nextDouble();
        totalInterest= goc*(interestRate/100)/12*month;
        System.out.println("Tiền lãi của bạn là: "+totalInterest);
    }
}
