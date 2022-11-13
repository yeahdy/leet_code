import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MyHashMap {
    
   HashMap<Integer, Integer> map;
    
    public MyHashMap() {
    	this.map = new HashMap<>();
    }
    
    public void put(int key, int value) {
    	map.put(key, value);
    }
    
    public int get(int key) {
    	// value 리턴, 해당 key가 없으면 -1 리턴
    	if(map.containsKey(key)) {
    		return map.get(key);
    	}
    	return -1;
    }
    
    public void remove(int key) {
        // key-value 삭제
    	if(map.containsKey(key)) {    		
    		map.remove(key);
    	}
    }
    

    
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */