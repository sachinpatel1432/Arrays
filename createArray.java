import java.util.Scanner;

public class createArray {

     public static int leanerSearch(int arr[], int key) {
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] == key) {
                    return i;
               }
          }

          return 0;
     }

     public static void main(String[] args) {
          int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
          int key = 50;
          int value = leanerSearch(arr, key);
          System.out.println(value);
     }
}