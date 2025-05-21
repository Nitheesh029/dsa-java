public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 10, 12, 16, 19, 33, 94, 104};
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[start] < arr[arr.length - 1]){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }


}
