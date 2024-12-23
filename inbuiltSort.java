import java.util.*;
import java.util.Collections;

public class inbuiltSort {
     // PrInteger function!!
     public static void prIntegerNums(Integer nums[]) {
          for (Integer i = 0; i < nums.length; i++) {
               System.out.print(nums[i] + " "); // PrInteger Numbers!!
          }
     }

     public static void main(String[] args) {
          Integer arr[] = { 5, 4, 1, 3, 2 };
          Arrays.sort(arr, 2, 5, Collections.reverseOrder());
          prIntegerNums(arr);
     }
}
