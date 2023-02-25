import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        ArrayList<Integer> result = new ArrayList();
		Arrays.sort(array);
        int answer = 0;

		for(int i = 0; i < array.length; i++) {
			 result.add(Math.abs(array[i]-n));
		}
		
		Collections.sort(result);
		
		if(Arrays.binarySearch(array, n - result.get(0)) >= 0) {
			answer = n - result.get(0);
		}
		else {
			answer =  n + result.get(0);
		}
        
        return answer;
    }
}