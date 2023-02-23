import java.util.*;

class Solution {
    public int solution(String s) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));  
        int answer=0;      
        
        while(list.contains("Z")) {                      
        	list.remove(list.indexOf("Z")-1);             
        	list.remove(list.indexOf("Z"));               
        }
        
        for(int i=0; i<list.size(); i++) {
            answer+=Integer.parseInt(list.get(i));
        }
        return answer;
    }
}