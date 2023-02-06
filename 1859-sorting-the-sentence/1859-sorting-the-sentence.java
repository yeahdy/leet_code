class Solution {
    public static String sortSentence(String s) {
    	String result = "";
    	
    	String[] array = s.split("\\s");
    	List<String> list = new ArrayList<>(Arrays.asList(array));
    	// *Arrays 를 통해 배열을 리스트로 그대로 바꿨을 경우, 해당 list를 수정할 경우 기존의 배열도 함께 변경된다. 
        
    	String word = "";
    	for(String arr : array) {
    		int index = arr.charAt(arr.length()-1) - '0';	// 숫자만 가져오기
    		word = arr.substring(0,arr.length()-1) + " ";	// 단어만 가져오기
    		
    		list.set(index-1, word);
    	}
    	
    	for(String str : list) {
    		result += str;
    	}
    	
        return result.substring(0,result.length()-1);
    }
}