import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int firstIndex = firstOccurrence(nums, target);
        int lastIndex =  lastOccurrence(nums, target);
        System.out.println(firstIndex + " " + lastIndex);
    }

     static int firstOccurrence(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                index = mid;
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return index;
    }
    static int lastOccurrence(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                index = mid;
                start = mid + 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return index;
    }
}
