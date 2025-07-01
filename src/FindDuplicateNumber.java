import java.util.Arrays;

class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr= {5,3,2,4,4,1};
        int res = findDuplicate(arr);
        System.out.println(res);
        System.out.println(Arrays.toString(arr));
    }
    static int findDuplicate(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return arr[j];
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}