public class reversArray {

     public static void revers(int arr[]) {
          int start = 0;
          int end = arr.length - 1;
          while (start <= end) {
               int temp;
               temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
          }
     }

     public static void main(String[] args) {
          int arr[] = { 2, 4, 6, 8, 10 };
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
          }
          System.out.println();

          revers(arr);

          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
          }
     }
}
