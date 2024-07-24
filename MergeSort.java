package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int [] ans = sort(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        //here we get two array
        //and we store it with two array
        int[] left = sort(Arrays.copyOfRange(arr , 0 ,mid));
        int[] right =sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left ,right);
    }
    static int[] merge (int[] first , int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
//this is for both first and second size of the array are same if that will not same below cases will continue
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
// this condition hits when any one array gets empty first
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        //returning new array to function which calls mix function
        return mix;
    }
}
