public class stockBuyAndSell {
    public static int buyAndSellfn(int [] arr){
        int min= arr[0];
        int maxProfit= 0;
        for(int i=1;i<arr.length;i++){

            int profit= arr[i]-min;
            maxProfit= Math.max(profit, maxProfit);
            min= Math.min(min, arr[i]);
            
            
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] arr= {5,1,2,3,9};
        int maxProfit=buyAndSellfn(arr);
        System.out.println(maxProfit);
    }
}
