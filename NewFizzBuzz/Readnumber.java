package Th;

public class Readnumber extends FizzBuzz {
    public void readNumber(int number){
        int dozens=number/10;
        int unit = number%10;
        switch (dozens){
            case 1:
                System.out.print(" Mười");
                break;
            case 2:
                System.out.print(" Hai Mươi");
                break;
            case 3:
                System.out.print(" Ba Mươi");
                break;
            case 4:
                System.out.print(" Bốn mươi");
                break;
            case 5:
                System.out.print(" Năm mươi");
                break;
            case 6:
                System.out.print(" Sáu mươi");
                break;
            case 7:
                System.out.print(" Bảy mươi");
                break;
            case 8:
                System.out.print("Tám mươi");
                break;
            case 9:
                System.out.print("Chín mươi");
                break;
            default:
                System.out.println("");
                break;
        }
        switch (unit){
            case 1:
                System.out.print(" một");
                break;
            case 2:
                System.out.print(" hai");
                break;
            case 3:
                System.out.print(" ba");
                break;
            case 4:
                System.out.print(" bốn");
                break;
            case 5:
                System.out.print(" năm");
                break;
            case 6:
                System.out.print(" sáu");
                break;
            case 7:
                System.out.print(" bảy");
                break;
            case 8:
                System.out.print(" tám");
                break;
            case 9:
                System.out.print(" chín");
                break;
            default:
                System.out.println(" ");
                break;
        }
    }
}
