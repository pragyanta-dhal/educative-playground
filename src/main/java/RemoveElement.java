import java.util.Arrays;

/*
We can modify the code to generate the (sub-array) of non-duplicate array
*/

public class RemoveElement {
    public static int[] remove(int[] arr, int key) {
        int nextElement = 0; // index of the next element which is not 'key'
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[nextElement] = arr[i];
                nextElement++;
            }
        }
        //return nextElement;
        return Arrays.copyOfRange(arr,0,nextElement);
    }

    public static int[] remove1(int[] arr) {
        int nextElement = 1; // nextElement means next available index for non-duplicate element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[nextElement-1]) {
                arr[nextElement] = arr[i];
                nextElement++;
            }
        }
        //return nextElement;
        return Arrays.copyOfRange(arr,0,nextElement);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 3, 6, 3, 10, 9, 3 };
        System.out.println(Arrays.toString(RemoveElement.remove(arr, 3)));

        arr = new int[] { 2, 2, 3, 3, 6, 9, 9 };
        System.out.println(Arrays.toString(RemoveElement.remove1(arr)));

        arr = new int[] { 2, 11, 2, 2, 1 };
        //System.out.println(RemoveElement.remove(arr, 2));
    }
}
