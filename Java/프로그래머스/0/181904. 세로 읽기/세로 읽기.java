class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String cut = "";
        String[] cuts = {};
        
        for(int i = m; i <= my_string.length(); i++){
            cut += my_string.substring(0, i) + ",";
            my_string = my_string.substring(i);
            i--;
        }
        
        cuts = cut.split(",");
        
        for(int i = 0; i < cuts.length; i++){
            answer += cuts[i].charAt(c - 1);
        }
        
        return answer;
    }
}