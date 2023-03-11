class Solution {
    public int titleToNumber(String columnTitle) {
        // "A" > 65 - 64
        // 다음 자릿수 마다 곱하기 26
        char column;
        int size = columnTitle.length(), order = 0;
        for(int i=0; i < size; i++){
            column = columnTitle.charAt(i);
            order += column - 64;
            if(size > 1 && i < size-1){
                order = order * 26;
            }
        }
     
        return order;
    }
}