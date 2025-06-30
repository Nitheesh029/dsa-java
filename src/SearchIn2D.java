public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,  4,  7,  11},
                {2,  5,  8,  12},
                {3,  6,  9,  16},
                {10, 13, 14, 17}
        };
        int target = 33;
        int res = search(arr, target);
        System.out.println(res);
    }
    static int search(int[][] arr, int target){
        if(arr == null || arr.length == 0) return -1;
        int row = 0;
        int col = arr[0].length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return arr[row][col];
            }else if(arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return -1;
    }
}
