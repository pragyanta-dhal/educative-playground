public class PairWithTargetSum {

    public static int[] search(int[] arr, int targetSum) {

        int start = 0, end = arr.length-1, result = 0;// = arr[start] + arr[end];
        while (start < end){
            result = arr[start] + arr[end];
            if(result == targetSum){
                return new int[] {start, end};
            }
            else if( result > targetSum){
                end--;
            } else {
                start++;
            }
        }
        return new int[] { -1,-1 };
    }

    public static void main(String[] args) {
        System.out.println("Output indices are " + search(new int[]{0,0,1,2,3,4,6}, 90)[0]+","+ search(new int[]{0,0,1,2,3,4,6}, 90)[1]);
        System.out.println("Output indices are " + search(new int[]{2,5,9,11}, 11)[0]+","+ search(new int[]{2,5,9,11}, 11)[1]);
    }
}