class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        stocks = prices

        mini = stocks[0]
        maxi = stocks[0]
        maxprofit = 0
        n = len(stocks)
        for i in range(1,n) :
            if stocks[i] < mini : 
                mini = stocks[i]
                maxi = stocks[i]
            elif stocks[i] > maxi :
                maxi = stocks[i]
            else :
                pass


            if maxprofit < maxi - mini :
                maxprofit = maxi - mini


        return maxprofit