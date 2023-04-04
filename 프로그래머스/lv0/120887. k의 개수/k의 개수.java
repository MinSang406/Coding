class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
		String strK = String.valueOf(k);
		
		for(int x = i; x <= j; x++) {
			String strX = String.valueOf(x);			
			if(strX.contains(strK)) {
				String[] xArr = strX.split("");			
				for(int y = 0; y < xArr.length; y++) {
					if(xArr[y].equals(strK)) {
						answer++;
					}
				}
			}
		}
        return answer;
    }
}