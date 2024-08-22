package ArrayDS.LeetCode.Easy;

public class BuySellStocks {
    public static int maxProfit(int[] stocks){
        int minPr=stocks[0];
        int maxProfit=0;
        for(int i=0;i<stocks.length;i++){
            if(minPr >stocks[i]){
                minPr=stocks[i];
            }
            else if(stocks[i] - minPr > maxProfit){
                maxProfit=stocks[i] -minPr;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
      int[] arr=  {7,1,5,3,6,4};
      int[] arr2={7,6,4,3,1};
      System.out.println(maxProfit(arr2));
    }
}
