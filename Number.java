import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số :");
        int number=sc.nextInt();
        int mod100= number/ 100;
        int mod10=(number-mod100*100)/10;
        int mod1=(number- mod100*100 - mod10*10);
        String num1="";
        if (mod100>0){
            switch (mod100) {
                case 1:
                    num1 += "Một";
                    break;
                case 2:
                    num1 += "Hai";
                    break;
                case 3:
                    num1 += "Ba";
                    break;
                case 4:
                    num1 += "Bốn";
                    break;
                case 5:
                    num1 += "Năm";
                    break;
                case 6:
                    num1 += "Sáu";
                    break;
                case 7:
                    num1 += "Bảy";
                    break;
                case 8:
                    num1 += "Tám";
                    break;
                case 9:
                    num1 += "Chín";
                    break;
            }
        }
            switch (mod10) {
                case 1:
                    num1 += " Một";
                    break;
                case 2:
                    num1 += " Hai";
                    break;
                case 3:
                    num1 += " Ba";
                    break;
                case 4:
                    num1 += " Bốn";
                    break;
                case 5:
                    num1 += " Năm";
                    break;
                case 6:
                    num1 += " Sáu";
                    break;
                case 7:
                    num1 += " Bảy";
                    break;
                case 8:
                    num1 += " Tám";
                    break;
                case 9:
                    num1 += " Chín";
                    break;
                default: num1+="không";
        }
                    switch (mod1) {
                        case 1:
                            num1 += " Một";
                            break;
                        case 2:
                            num1 += " Hai";
                            break;
                        case 3:
                            num1 += " Ba";
                            break;
                        case 4:
                            num1 += " Bốn";
                            break;
                        case 5:
                            num1 += " Năm";
                            break;
                        case 6:
                            num1 += " Sáu";
                            break;
                        case 7:
                            num1 += " Bảy";
                            break;
                        case 8:
                            num1 += " Tám";
                            break;
                        case 9:
                            num1 += " Chín";
                            break;
                        default: num1+="không";
                    }
        System.out.println(num1);
    }
}
