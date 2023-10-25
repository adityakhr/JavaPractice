import java.util.*;

public class SuffleTheArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Shuffled Array: " + Arrays.toString(shuffleTheArray(array)));
    }
    private static int[] shuffleTheArray(int[] array) {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index=random.nextInt(6-0 + 1)+0;
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
