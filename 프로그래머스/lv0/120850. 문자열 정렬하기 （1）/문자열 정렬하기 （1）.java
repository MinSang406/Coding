import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String numbers;
        
        numbers = my_string.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
		String[] arr = numbers.split("");
		
		answer = new int [arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			answer[i] = Integer.parseInt(arr[i]);
		}

		Arrays.sort(answer);
        
        return answer;
    }
}