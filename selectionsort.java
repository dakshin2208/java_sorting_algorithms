package SortingAlgorithms;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selection(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxindex = maxgetindex(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maxgetindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
