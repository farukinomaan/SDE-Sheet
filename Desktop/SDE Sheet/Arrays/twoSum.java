import java.util.*;

public class twoSum {
    // public static int [] twoSum(int nums[], int target){
    //     for(int i=0;i<nums.length-1;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]+nums[j]==target){
    //                 return new int[]{i,j};
    //             }
    //         }

    //     }
    //     return new int[]{};
    // }
        public static int[] twoSum(int nums[], int target){
            Map <Integer, Integer> map= new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int complement= target-nums[i];
                if(map.containsKey(complement)){
                    return new int[] {map.get(complement),i};
                }
                map.put(nums[i],i);
            }
            return new int[]{};
        }
    public static void main(String[] args) {
        int [] nums= {11,7,7,2};
        int target=9;
        int [] result= twoSum(nums, target);
        System.out.println(result[0]+" "+ result[1]);
        
        
    }
}