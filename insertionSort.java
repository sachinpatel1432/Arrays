public class insertionSort {

     public static void insertionSort(int arr[]) {
          int n = arr.length;
          for (int i = 1; i < n; i++) {
               int curr = arr[i];
               int prev = i - 1;

               while (prev >= 0 && arr[prev] > curr) {
                    arr[prev + 1] = arr[prev];
                    prev--;
               }

               arr[prev + 1] = curr;
          }

     }

     // Print function!!
     public static void printNums(int nums[]) {
          for (int i = 0; i < nums.length; i++) {
               System.out.print(nums[i] + " "); // Print Numbers!!
          }
     }

     public static void main(String[] args) {
          int arr[] = { 5, 4, 1, 3, 2 };
          insertionSort(arr);
          printNums(arr);
     }
}
