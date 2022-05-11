import java.util.Scanner;

public class FindMax {
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
        System.out.println("Số lớn nhất là: ");
        System.out.println(finMax(arr));
    }
    public static float finMax(float[]arr){
        float max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
