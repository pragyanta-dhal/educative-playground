import java.util.Arrays;

public class RemoveDuplicatesSorted {
    public static int remove(int[] arr) {
        int counter =0;
        for(int i =1; i< arr.length; i++){
            if(arr[i] == arr[i-1]){
                counter++;
            }
        }

        return arr.length - counter;
    }

    public static void main(String[] args) {
        System.out.println("Output array size : "+ remove(new int[]{2, 3, 3, 3, 6, 9, 9}));
        int[] newArr = Arrays.copyOfRange(new int[]{2, 3, 3, 3, 6, 9, 9},0,remove(new int[]{2, 3, 3, 3, 6, 9, 9}));
        System.out.println("Output array size : "+ remove(new int[]{2, 2, 2, 11}));
    }
}
