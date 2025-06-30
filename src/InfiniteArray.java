public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 8, 11, 15, 16, 18, 22, 27, 33, 36, 37, 44, 66, 68, 77, 88};
        int target = 77;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr, target, start, end);
    }
    static int search(int[] arr, int target, int start, int end){
        int index = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                index = mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return index;
    }
}
