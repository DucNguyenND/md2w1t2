import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int number= sc.nextInt();
        int [] arr=new int[number];
        int count=0;
        while (count<number){
            System.out.println("Nhập phần tử thứ "+ (count+1) );
            int a= sc.nextInt();
            arr[count]=a;
            count++;
        }
        System.out.println("Nhập vị trí bạn muốn thêm:");
        int num=sc.nextInt();
        System.out.println("Nhập giá trị bạn muốn thêm:");
        int value1= sc.nextInt();
        for (int i = 0; i < arr.length+1; i++) {
            System.out.print(add(arr,num,value1)[i]+" ");

        }
    }
    public static int[] add(int[]arr, int num,int value1){
        int[] arr1=new int[arr.length+1];
        for (int i = 0; i <arr.length; i++) {
            if (i<num) {
                arr1[i]=arr[i];
            }
            else arr1[i+1]=arr[i];
        }
        arr1[num]=value1;
        return arr1;
    }
}
