public class pairs {
     public static void main(String[] args) {
          int arr[] = { 2, 4, 6, 8, 10 };

          for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                    int curr = arr[i];
                    System.out.print("(" + curr + "," + arr[j] + ")");
               }
               System.out.println();
          }
     }
}
