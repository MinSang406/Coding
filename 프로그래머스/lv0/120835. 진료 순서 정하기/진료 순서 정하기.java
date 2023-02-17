import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
		int[] sort = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++) {
			sort[i] = emergency[i];			
		}
		
		Arrays.sort(sort);
        
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
				if(emergency[j] == sort[i]) {
					answer[j] = emergency.length - i;
                    
                    }
               }
           }
       return answer;
    }

}