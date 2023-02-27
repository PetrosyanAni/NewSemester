package sortArray;

public class SortArray {
    public static void main(String[] args) {
        int[] num = {-23, 5, 12};
        int[] arr = {5, 12, 5, 5, 12};

        int[] sortedArray = new int[arr.length];
        int o = 0;
        for (int i = 0, j = 0; j < num.length; ) {
            if (arr[i] == num[j]) {
                sortedArray[o] = arr[i];
                o++;
                i++;
            } else {
                i++;
            }
            if (i == arr.length) {
                i = 0;
                j++;
            }
        }
        for (int a: sortedArray){
            System.out.println(a);
        }
    }
}
