public class Snt20 {
    public static void main(String[] args) {
        int count=0;
        int a=2;
        System.out.println("20 số nguyên tố đầu tiên là:");
        while (count<20){
            if (checkSNT(a)) {
                System.out.print(a+" ");
                count++;
            }
            a++;
        }
    }
    public static boolean checkSNT(int a) {
        for (int i = 2; i <a ; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
