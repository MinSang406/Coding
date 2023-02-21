class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int[] answer = new int [numbers.length];

		if(direction.equals("right")) {
			for(int i = 0; i < numbers.length; i++) {
				answer[(i+1) % numbers.length] = numbers[i];
			}
		}
		if(direction.equals("left")) {
			for(int i = 0; i < numbers.length; i++) {
				answer[(i + numbers.length - 1) % numbers.length] = numbers[i];			
			}
		}
        return answer;
    }
}