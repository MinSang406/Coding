class Solution {
    public String solution(String my_string) {
        char[] arr = new char [my_string.length()];
		String answer = "";

		for(int i = 0; i < my_string.length(); i++) {
			arr[i] = my_string.charAt(i);
		}
		
		for(int i = 0; i <arr.length; i++) {
			if(65 <= (int)arr[i] && (int)arr[i] <= 90) {
				answer += (char)((arr[i]) + 32);
			}
			else if(97 <= (int)arr[i] && (int)arr[i] <= 122) {
				answer += (char)((arr[i]) - 32);
			}
		}
        return answer;
    }
}