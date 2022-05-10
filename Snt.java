import java.util.Scanner;

public class Snt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int c= sc.nextInt();
        boolean check=true;
        if (c>2){
            for (int i = 2; i <c/2 ; i++) {
                if (c%i==0){
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.println(c + " là số nguyên tố");
        }
        else System.out.println(c+ " không là số nguyên tố");
    }
}
