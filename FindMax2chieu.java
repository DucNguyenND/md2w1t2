public class FindMax2chieu {
    public static void main(String[] args) {
        int arr[][]= {{3,4,2,8,3},{3,9,6,2,1},{8,3,9,4}};
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (max<arr[i][j]) max=arr[i][j];
            }
        }
        System.out.println("Max= " +max);
    }
}
