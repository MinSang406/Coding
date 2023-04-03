import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String[] befArr = before.split("");
		String[] aftArr = after.split("");
		
		Arrays.sort(befArr);
		Arrays.sort(aftArr);
				
		for(int i = 0; i < befArr.length; i++) {
			if(!befArr[i].equals(aftArr[i])) {
				answer = 0;
			}
		}
        
        return answer;
    }
}