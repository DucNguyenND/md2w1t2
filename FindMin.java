import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int number = sc.nextInt();
        float[] arr = new float[number];
        int count = 0;
        while (count < number) {
            System.out.println("Nhập phần tử thứ: " + (count + 1));
            int a = sc.nextInt();
            arr[count] = a;
            count++;
        }
        System.out.println("Số nhỏ nhất là: ");
        System.out.println(finMax(arr));
    }
    public static float finMax(float[]arr){
        float min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
