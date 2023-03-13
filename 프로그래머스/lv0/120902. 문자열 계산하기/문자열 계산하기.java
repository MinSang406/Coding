class Solution {
    public int solution(String my_string) {
		String[] arr = my_string.split(" ");
		int answer = Integer.parseInt(arr[0]);
		
		int i = 0;
		
		while(i < arr.length - 1) {
			
			if(arr[i].equals("+")) {
				answer += Integer.parseInt(arr[i+1]);
			}
			else if(arr[i].equals("-")) {
				answer -= Integer.parseInt(arr[i+1]);
			}
			i++;
		}
        return answer;
    }
}