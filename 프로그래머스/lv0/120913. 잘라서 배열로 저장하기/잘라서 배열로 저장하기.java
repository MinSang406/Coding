class Solution {
    public String[] solution(String my_str, int n) {
        int numOfSubstr = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1; 
        String[] answer = new String[numOfSubstr]; 
		
        for (int i = 0; i < numOfSubstr; i++) {
            int start = i * n; 
            int last = Math.min((i + 1) * n, my_str.length()); 
            
            answer[i] = my_str.substring(start, last);
        }
        return answer;
    }
}