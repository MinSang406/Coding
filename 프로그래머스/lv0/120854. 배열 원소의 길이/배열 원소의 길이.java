class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
		
		for(int j = 0; j < strlist.length; j++) {
            String[] arr = strlist[j].split("");
          	  answer[j] = arr.length;
		}
        
        return answer;
    }
}