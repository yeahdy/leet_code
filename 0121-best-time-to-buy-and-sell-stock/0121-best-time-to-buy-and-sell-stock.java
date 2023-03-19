class Solution {
    public int maxProfit(int[] prices) {
        // point!
        // 처음부터 전체 배열에서 가장 최소값을 찾는게 아니다! 실시간으로 하나씩 비교하면서 갱신 해줘야 한다.
        
        int min= prices[0], max = prices[0], temp=0, profit=0;
        for(int i=1; i<prices.length; i++){
            // 더 비싸게 팔 수 있는 날
            if(prices[i] > min){
                max = prices[i];
            }else{
                // 다음날 더 싸게 살 수 있다면 최소값 갱신 + 파는 값 갱신
                min = prices[i];
                max = prices[i];
            }
            
            // 수익 구하기
            temp = max - min;
            // 최대 수익 갱신
            if(temp > profit) profit = temp;
        }
        
        return profit;
    }
}
