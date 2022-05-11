import java.util.Scanner;

public class Splice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int number= sc.nextInt();
        int [] arr=new int[number];
        int count=0;
        while (count<number){
            System.out.println("Nhập phần tử thứ: "+ (count+1) );
            int a= sc.nextInt();
            arr[count]=a;
            count++;
        }
        System.out.println("Nhập vị trí bạn muốn xóa:");
            int num=sc.nextInt();
        for (int i = 0; i < arr.length-1; i++) {
        System.out.print(spLice(arr, num)[i]+" ");
        }
    }
    public static int[] spLice(int[]arr, int num){
        int[] arr1=new int[arr.length-1];
        for (int i = 0; i <arr.length; i++) {
            if (i<num) {
                arr1[i]=arr[i];
            }
            else
                if (i>num) arr1[i-1]=arr[i];
        }
        return arr1;
    }
}
