class Solution {
    public int solution(String[] babbling) {
        String[] talkArr = {"aya", "ye", "woo", "ma"};
		int answer = 0;
		
		for(int i = 0; i < babbling.length; i++) {
			for(int j = 0; j < talkArr.length; j++) {
				babbling[i] = babbling[i].replaceAll(talkArr[j], "1");
                // ""로 할 경우 wyeoo일때 w'ye'oo -> woo -> ""이 되기때문
				}
			}
		
		for(int i = 0; i < babbling.length; i++) {
			babbling[i] = babbling[i].replaceAll("1", "");
			if(babbling[i].isEmpty()) {
				answer++;
			}
		}
		
        return answer;
    }
}