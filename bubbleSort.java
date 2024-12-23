public class bubbleSort {

     public static void bubbleSort(int nums[]) {

          // Bubble Sort Algorithm!!
          int n = nums.length;
          for (int i = 0; i < n - 1; i++) { // Outer loop run n - 1 times
               for (int j = 0; j < n - 1 - i; j++) { // Outer loop run n - 1 - i times
                    if (nums[j] > nums[j + 1]) { // Check conditions!!
                         // Swap
                         int temp = nums[j];
                         nums[j] = nums[j + 1];
                         nums[j + 1] = temp;
                    }
               }
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
          bubbleSort(nums); // Bubble sort function calling!!
          printNums(nums); // Print function calling!!
     }
}
