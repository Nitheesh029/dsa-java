public class FindFloor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 9, 14, 16, 18};
        int target = 15;
        int ans = findFloor(arr, target);
        System.out.println(ans);
    }
    static int findFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int floor = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] < target) {
              floor = arr[mid];
              start += mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return floor;
    }
}
