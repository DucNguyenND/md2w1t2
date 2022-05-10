public class Snt100 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Số nguyên tố nhỏ hơn 100 là:");
        for (int a = 2; a <100 ; a++) {
            boolean check=true;
            for (int i = 2; i <a ; i++) {
                if (a%i==0) {
                    check = false;
                    break;
                }
                }
            if (check) {
                System.out.print(a+" ");
                count++;
            }
            }
        }
    }
