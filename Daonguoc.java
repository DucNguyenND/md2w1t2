import java.util.Scanner;

public class Daonguoc {
    public static int[] reverSe(int [] arr,int number ) {
        int[]arr1=new int[number];
        for (int i =0;i<number;i++) {
            arr1[arr.length-i-1]=arr[i];
        }
        return arr1;
    }
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
        System.out.println("Mảng đảo ngược là: ");
        for (int i = 0; i < number; i++) {
            System.out.print(reverSe(arr,number)[i]+"\t");

        }
    }
}
