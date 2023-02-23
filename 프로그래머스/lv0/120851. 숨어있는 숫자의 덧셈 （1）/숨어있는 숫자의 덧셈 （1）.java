class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String numbers;

		numbers = my_string.replaceAll("[a-z, A-Z]", "");
		String[] arr = numbers.split("");
				
		for(int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(arr[i]);
		}
        
        return answer;
    }
}