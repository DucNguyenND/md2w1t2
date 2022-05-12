public class B8_Gop_mang {
    public static void main(String[] args) {
        int array1 []= {4,7,7,2,9,2};
        int array2 []={2,8,4,1,2,5};
        int totalArray [] = new int[array1.length+array2.length];
        System.out.println("Mang sau khi gop la:");
        int x=0;
        for(int i=0;i<array1.length;i++){
            totalArray[x]=array1[i];
            x++;
        }
        for(int j=0;j<array2.length;j++){
            totalArray[x]=array2[j];
            x++;
        }
        for(int j=0;j<totalArray.length;j++){
            System.out.print(totalArray[j]+" ");
        }
    }
}
