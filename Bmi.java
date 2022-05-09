import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập cân nặng: ");
        double weight=scanner.nextDouble();
        System.out.println(" Nhập chiều cao:");
        double height=scanner.nextDouble();
        double bmi= weight/ Math.pow(height,2);
        if (bmi<18.5){
            System.out.println("Underweight");
        }
        else
            if (18.5<=bmi && bmi<25.0) {
            System.out.println("Normal");
            }
            else
                if (25.0<=bmi && bmi<30.0){
                    System.out.println("Overweight");
                }
                else System.out.println("Obese");

    }
}
