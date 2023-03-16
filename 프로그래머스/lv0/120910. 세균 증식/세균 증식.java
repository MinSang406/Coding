class Solution {
    public int solution(int n, int t) {

        for(int i = 1; i <= t; i++) {
			n += n ;
		}
        
        return n;
    }
}