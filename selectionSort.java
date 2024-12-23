public class selectionSort {

     public static void selectionSort(int nums[]) {
          int n = nums.length;

          for (int i = 0; i < n - 1; i++) { // Outer loop run n - 2 times
               int minPos = i;
               for (int j = i; j < n; j++) { // Outer loop run n - 1 - i times
                    if (nums[minPos] > nums[j]) {
                         minPos = j;
                    }
               }
               // Swap

               int temp = nums[minPos];
               nums[minPos] = nums[i];
               nums[i] = temp;
          }
     }

     // Print function!!
     public static void printNums(int nums[]) {
          for (int i = 0; i < nums.length; i++) {
               System.out.print(nums[i] + " "); // Print Numbers!!
          }
     }

     // Main functions!!
     public static void main(String[] args) {
          int nums[] = { 5, 4, 1, 3, 2 };
          selectionSort(nums); // Bubble sort function calling!!
          printNums(nums); // Print function calling!!
     }
}