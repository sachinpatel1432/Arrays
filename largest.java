import java.util.*;

public class largest {

     public static int largest(int arr[]) {
          int larg = Integer.MIN_VALUE;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] > larg) {
                    larg = arr[i];
               }
          }
          return larg;
     }

     public static void main(String[] args) {
          int arr[] = { 1, 5, 4, 6, 8, 20 };
          int larg = largest(arr);
          System.out.println(larg);
     }
}
