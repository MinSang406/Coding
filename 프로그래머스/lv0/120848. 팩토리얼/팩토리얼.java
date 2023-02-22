class Solution {
    public int solution(int n) {
        int answer = 0;
        long total = 1;
		int i = 1;
		
		while(total <= n) {
			total *= i;
			answer++;
			i++;
			System.out.println(total);
		}
        
        return answer - 1;
    }
}