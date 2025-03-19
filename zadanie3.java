public class zadanie3 {

    public static int[] rotateArray(int[] array, int positions) {

        if (array == null || positions < 0) {
            return array;
        }
        int n = array.length;
        positions = positions % n;

        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[positions] = array[i];
        }
        return newArray;

    }
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int positions = 2;

        int[] result = rotateArray(array, positions);

        System.out.println();
        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}
