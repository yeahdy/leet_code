class Solution {
    // 1~x 까지의 합 == x~n 까지의 합
    /*
    Q.피벗 정수란?
    피벗 앞에는 피벗보다 값이 작은 모든 원소들이 오고,
    피벗 뒤에는 피벗보다 값이 큰 모든 원소들이 오도록 하여 피벗 정수를 기준으로 둘로 나누는 것.
    */
    public int pivotInteger(int n) {
        //(n*(n+1))/2
        // 1+2+3+4+5+6+7+8
        // 1부터 어떤 수의 합이 n 이상이 될때까지 계산 한 후에 뒤에서 부터 하나씩 더해온다.
        int end = n;
        for(int i=1; i<=n; i++){
            int start = (i*(i+1))/2;
            
            // System.out.println("start :: " + start + " / end :: "+end);
            if(start >= end){
                if(n == i && start == end) return i;
                n--;
                end += n;
            }
            
        }
        
        return -1;
    }
}