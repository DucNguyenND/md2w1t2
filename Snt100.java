public class Snt100 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Số nguyên tố nhỏ hơn 100 là:");
        for (int a = 2; a < 100; a++) {
            if (checkSNT(a)) {
                System.out.print(a + " ");
            }
        }
    }

        public static boolean checkSNT(int a) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) return false;
            }
            return true;
        }
    }
