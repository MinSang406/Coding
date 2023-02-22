class Solution {
    public String solution(String my_string) {
        String[] gather = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i < gather.length; i++) {
		my_string = my_string.replaceAll(gather[i], "");
		}
        
        return my_string;
    }
}