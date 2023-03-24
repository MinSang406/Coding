class Solution {
    public int solution(String my_string) {
        int answer = 0;
		
		String numbers = my_string.replaceAll("[a-z, A-Z]", " ");
		String[] arr = numbers.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("")) {
			    answer += Integer.parseInt(arr[i]);
			}
		}
        return answer;
    }
}