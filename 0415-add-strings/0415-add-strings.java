class Solution {
    public String addStrings(String num1, String num2) {
        String result = "";
		List<Integer> origin1 = new ArrayList<>();
		List<Integer> origin2 = new ArrayList<>();	
		
		for(int i=num1.length()-1; i >= 0; i--) {
			 origin1.add(num1.charAt(i) - '0');
		}
		
		for(int i=num2.length()-1; i >= 0; i--) {
			 origin2.add(num2.charAt(i) - '0');
		}
		
		int length = origin1.size() > origin2.size()? origin1.size() : origin2.size();
		int sumNum = 0;		
		for(int i=0; i < length; i++) {		
			if(origin1.size() > i) {	
				sumNum = origin1.get(i)+sumNum;
			}
			if(origin2.size() > i) {	
				sumNum = origin2.get(i) + sumNum;	 				
			}
			
			System.out.println(sumNum);
			result += Integer.toString(sumNum % 10);	
			sumNum = sumNum / 10;	
			
			if(i == length-1 && sumNum > 0) {
				result += "1";
			}
		}
		
		StringBuffer sb = new StringBuffer(result);
		result = sb.reverse().toString();
		
		return result;
    }
}