class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;
			
			for(int i = 0; i < k; i++) {
					answer = numbers[cnt % numbers.length];
					cnt += 2; 
				}
        return answer;
    }
}