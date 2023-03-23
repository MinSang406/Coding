class Solution {
    public int solution(int[][] dots) {
        int horizontalMax = dots[0][0];
		int horizontalMin = dots[0][0];
		int verticalMax = dots[0][1];
		int verticalMin = dots[0][1];
		
		
		for(int i = 0; i < dots.length; i++) {
			horizontalMax = Math.max(dots[i][0], horizontalMax);
			horizontalMin = Math.min(dots[i][0], horizontalMin);	
			
			verticalMax = Math.max(dots[i][1], verticalMax);
			verticalMin = Math.min(dots[i][1], verticalMin);
		}
		int answer = (horizontalMax - horizontalMin) * (verticalMax - verticalMin);
        return answer;
    }
}