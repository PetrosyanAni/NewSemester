package divider;

public class Divider {
    static int[] array;

    static int findSmallestNumber() {
        array = new int[]{2, 3, 5};
        int smallerInt = array[0];
        for (int i = 1; i < array.length - 2; i++) {
            if (array[i] <= smallerInt) {
                smallerInt = array[i];
            }
        }
        return smallerInt;
    }

    static int smallerIntArray = findSmallestNumber();

    public static void main(String[] args) {

        for (int i = 0; i < array.length - 1; ) {
            if (array[i] % smallerIntArray != 0) {
                smallerIntArray--;
                i = 0;
            }
            i++;
        }
        System.out.println("Biggest Divider is" + smallerIntArray);

    }
}
