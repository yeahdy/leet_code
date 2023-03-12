class Solution {
    public String reverseWords(String s) {
        // 띄어쓰기 기준으로 배열에 담는다.
        String[] arr = s.split("\\s");
        String sentence = "";
        
        for(int i=0; i<arr.length; i++){
            String word = "";
            
            // 각 단어를 뒤에서 부터 한 자 씩 배열에 담는다.
            for(int j=arr[i].length()-1; j >= 0; j--){
                word += arr[i].charAt(j) + "";
            }
            // 배열방마다 띄어쓰기 포함해서 연결
            sentence += word + " ";
        }
        sentence = sentence.substring(0,sentence.length()-1);
        
        return sentence;
    }
}