public class Sort {
    public int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int index = i;
            while (index > 0 && temp < list[index - 1]) {
                list[index] = list[index - 1];
                index--;
            }
            list[index] = temp;
        }
        return list;
    }
}
