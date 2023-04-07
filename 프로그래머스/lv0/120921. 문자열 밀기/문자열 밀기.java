class Solution {
    public int solution(String A, String B) {
        int answer = 0;
		
		String idxB = B + B; 
		answer = idxB.indexOf(A);
        return answer;
    }
}