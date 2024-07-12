package SortingAlgorithms;

public class selection2 {
    public static void main(String[] args) {

    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1;
            int maxinteger = getmaxindex(arr , 0 , last);
            swap(arr ,maxinteger,last);

        }
    }
    static void swap(int[] arr , int start , int end){
        int temp =arr[start];
         arr[start] = arr[end];
         arr[end] = temp;

    }
    static int getmaxindex(int[] arr , int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] <arr[i]){
                max =i;
            }

        }
        return max;
    }
}
