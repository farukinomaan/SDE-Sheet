// Maximum Subarray Sum in an Array
//Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
//has the largest sum and returns its sum and prints the subarray.

import java.util.*;

//Brute

// public class kadaneAlgorithm {
//     public static int FuncBrute(int [] arr){
//         int max= Integer.MIN_VALUE;
//         for(int i=0; i<arr.length;i++){
//             for(int j=0; j<arr.length;j++){
//                 int sum=0;
//                 for(int k=i;k<j;k++){
//                     sum += arr[k];
                    
//                 }
//                 max= Math.max(max, sum);
//             }
//         }
//         return max;


//     }
//     public static void main(String[] args) {
//         int [] arr ={-2,-1,-3,4,-1,2,1,-5,4};
//         int maxSum= FuncBrute(arr);
//         System.out.println(maxSum);
        
//     }
    
// }

// Better

// public class kadaneAlgorithm {
//     public static int funcBetter(int [] arr){   
        
//         int max= Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             int sum= 0;
//             for(int j=i;j<arr.length;j++){
//                 sum+= arr[j];
//                 max= Math.max(max, sum);
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int [] arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int maxSum= funcBetter(arr);
//         System.out.println(maxSum);
//     }
// }

// Optimal : Kadane's Algorithm

public class kadaneAlgorithm {
    public static long kadaneAlg(int [] arr){
        long maxi = Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];

            if(sum>maxi){
                maxi=sum;
            }

            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        long maxSum= kadaneAlg(arr);
        System.out.println(maxSum);
        
    }
}