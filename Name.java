import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập tên của bạn:");
        String name= scanner.nextLine();
        System.out.println("Xin chào "+ name);
    }
}
