public class binarySearch {

     public static int binarySearch(int arr[], int key) {
          int front = 0;
          int rear = arr.length - 1;
          while (front <= rear) {
               int mid = (front + rear) / 2;

               if (key == arr[mid]) {
                    return mid;
               }

               if (key < arr[mid]) {
                    rear = mid - 1;
               } else {
                    front = mid + 1;
               }
          }
          return 0;
     }

     public static void main(String[] args) {
          int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
          int key = 9;

          System.out.println(binarySearch(arr, key));
     }
}
