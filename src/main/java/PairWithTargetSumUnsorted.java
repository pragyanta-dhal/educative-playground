import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class PairWithTargetSumUnsorted {

    public static int[] search(int[] arr, int targetSum) {

        int start = 0, diff;
        Map<Integer, Integer> nums = new HashMap<>();
        while(start < arr.length){
            diff = targetSum - arr[start];
            if(nums.containsKey(diff)) {
                return new int[] {start,nums.get(diff)};
            }
            else{
                nums.put(arr[start],start++);
                //start++;
            }

        }

        return new int[] { -1,-1 };
    }

    public static void main(String[] args) {
        System.out.println("Output indices are " + search(new int[]{3,6,1,2,4}, 6)[0]+","+ search(new int[]{3,6,1,2,4}, 6)[1]);
        System.out.println("Output indices are " + search(new int[]{2,11,9,5}, 11)[0]+","+ search(new int[]{2,11,9,5}, 11)[1]);
    }
}