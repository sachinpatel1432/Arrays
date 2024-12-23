import java.util.*;

public class countingSort {

     public static void countingSort(int arr[]) {
          int largest = Integer.MIN_VALUE;
          for (int i = 0; i < arr.length; i++) {
               largest = Math.max(largest, arr[i]);
          }

          int count[] = new int[largest + 1];
          for (int i = 0; i < arr.length; i++) {
               count[arr[i]]++;
          }

          int j = 0;
          for (int i = 0; i < count.length; i++) {
               while (count[i] > 0) {
                    arr[j] = i;
                    j++;
                    count[i]--;
               }
          }
     }

     // Print function!!
     public static void printNums(int nums[]) {
          for (int i = 0; i < nums.length; i++) {
               System.out.print(nums[i] + " "); // Print Numbers!!
          }
     }

     public static void main(String[] args) {
          int arr[] = { 5, 4, 3, 2, 1 };
          countingSort(arr);
          printNums(arr);
     }
}
