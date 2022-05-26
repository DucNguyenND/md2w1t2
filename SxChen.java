public class SxChen {
    static int arr[]={1,5,4,2,6,8,9};

    public static void main(String[] args) {
        for (int i = 1; i < arr.length; i++) {
            int temp= arr[i];
            int index=i;
            while(index> 0 && temp < arr[index-1]){
                arr[index] = arr[index-1];
                index--;
            }
            arr[index] = temp;
            System.out.println("Đẩy "+ arr[i-1] + " xuống vị trí của "+ arr[i] );
            for (int value: arr) {
                System.out.print(value + " ");
            }
            System.out.println("");
        }
    }
}
