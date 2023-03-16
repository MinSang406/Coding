import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] arr = new char [my_string.length()];
		
		for(int i = 0; i < my_string.length(); i++) {
			arr[i] = my_string.charAt(i);
		}
		
		for(int i = 0; i <arr.length; i++) {
			if(65 <= arr[i] && arr[i] <= 90) {
				arr[i] = (char)((arr[i]) + 32);
			}
			else if(97 <= arr[i] && arr[i] <= 122) {
				arr[i] = (char) arr[i];
			}
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < my_string.length(); i++) {
			answer += arr[i];
		}
        
        return answer;
    }
}