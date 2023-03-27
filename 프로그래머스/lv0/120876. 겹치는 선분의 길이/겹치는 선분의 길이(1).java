import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] lines) {
        List<Integer> overLap = new ArrayList<>();
        int cnt = 0;

        for(int i = 0; i <= 2; i++){
            int s = lines[i][0]>lines[i][1]?lines[i][1]:lines[i][0];
            int b = lines[i][0]>lines[i][1]?lines[i][0]:lines[i][1];  
            for(int j = s; j < b; j++){
                if(overLap.contains(j)){
                    overLap.remove(Integer.valueOf(j));
                    cnt++;
                    } else overLap.add(j);
                }
            }
        return cnt;
    }
}
