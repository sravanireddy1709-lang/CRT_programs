package cse;
import java.util.Arrays;
public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) return arr;

        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];
        return Arrays.copyOf(temp, j);
    }

    public static void main(String[] args) {
        int[] original = {4, 2, 5, 2, 3, 4, 1, 5};
        int[] unique = removeDuplicates(original);

        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Array without duplicates: " + Arrays.toString(unique));
    }
}

	

