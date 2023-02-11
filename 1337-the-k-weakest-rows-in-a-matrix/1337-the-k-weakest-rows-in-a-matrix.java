class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> hashMap = new HashMap<>();
		
		// 각 행에서 1을 갯수를 count
		for(int i=0; i < mat.length; i++) {
			int count= 0;
			
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == 1) {
					count++;
				}
			}
			// Map<Integer,Integer> 형태로 저장
			hashMap.put(i, count);			
		}
		
		// Collections.sort() 통해 값으로 오름차순 정렬하여 key값 반환
		List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(hashMap.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		int[] result = new int[k];
		for(int i=0; i<k; i++) {
			result[i] = entryList.get(i).getKey();
		}
		
        return result;
        //        다른사람 답 
//        return map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .limit(k)	
//                .map(Map.Entry::getKey)	// 연산한 새로운 stream 반환
//                .mapToInt(it -> it)		// IntStream 타입으로 반환.
                                            // int[] 로 변환을 위해 Integer > int 변환 필요 
//                .toArray();
    }
}