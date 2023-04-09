class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
		int middleNum = total / num;
		int divNum = num / 2;
		
		if(total % num != 0) {
			divNum = num / 2 -1;
		}
		
		int startNum = middleNum - divNum;
		
		for(int i = 0; i < num; i++) {
			answer[i] = startNum + i;
		}
        
        return answer;
    }
}