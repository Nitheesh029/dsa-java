public class FindCeiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 12, 14, 19, 21, 25, 34, 37, 55};
        int target = 23;
        int ans = findCeiling(arr, target);
        System.out.println(ans);
    }

    static int findCeiling(int[] arr, int target){
        int value = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                value = arr[mid];
                end = mid - 1;
            }
        }
        return value;
    }
}
