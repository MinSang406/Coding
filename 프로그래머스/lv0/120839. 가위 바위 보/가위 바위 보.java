class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");

        for(int i = 0; i < arr.length; i++) {
        	if(Integer.parseInt(arr[i]) == 0) {
        		answer += Integer.toString(5);
        	} 
        	else if(Integer.parseInt(arr[i]) == 2) {
        		answer += Integer.toString(0);
        	} 
        	else if(Integer.parseInt(arr[i]) == 5) {
        		answer += Integer.toString(2);
        	}
        }
        return answer;
    }
}