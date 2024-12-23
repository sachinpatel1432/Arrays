public class maximumSubArraySum {

     public static int prifixMaxSum(int arr[]) {
          int maxSum = Integer.MIN_VALUE;
          int currSum;
          int prifix[] = new int[arr.length];

          prifix[0] = arr[0];

          for (int i = 1; i < arr.length; i++) {
               prifix[i] = prifix[i - 1] + arr[i];
          }

          for (int i = 0; i < arr.length; i++) {
               System.out.print(prifix[i] + " ");
          }

          System.out.println();

          for (int i = 0; i < arr.length; i++) {
               currSum = 0;
               for (int j = i; j < arr.length; j++) {
                    currSum = i == 0 ? prifix[j] : prifix[j] - prifix[i - 1];
               }
               if (currSum > maxSum) {
                    maxSum = currSum;
               }
          }

          return maxSum;

     }

     public static int innermaximumSubArraySum(int arr[]) {

          int maxSum = Integer.MIN_VALUE;
          int currSum;

          for (int i = 0; i < arr.length; i++) {
               for (int j = i; j < arr.length; j++) {
                    currSum = 0;
                    for (int k = i; k <= j; k++) {
                         currSum += arr[k];
                         // System.out.print(arr[k] + "->");
                    }
                    System.out.println(currSum);
                    if (currSum > maxSum) {
                         maxSum = currSum;
                    }
               }
          }
          return maxSum;
     }

     public static void kadanes(int arr[]) {
          int cs = 0;
          int ms = Integer.MIN_VALUE;

          for (int i = 0; i < arr.length; i++) {
               cs = cs + arr[i];
               if (cs < 0) {
                    cs = 0;
               }

               ms = Math.max(ms, cs);
          }

          System.out.println(ms);
     }

     public static void main(String[] args) {
          int arr[] = { 1, -2, 6, -1, 3 };
          // int max = innermaximumSubArraySum(arr);
          // System.out.println(max);
          // System.out.println(prifixMaxSum(arr));
          kadanes(arr);
     }
}
