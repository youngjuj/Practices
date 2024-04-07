import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String postfix = "";
        
        for(int i = 0; i < my_string.length(); i++){
            postfix += my_string.substring(i) + ",";
        }
        
        answer = postfix.split(",");
        Arrays.sort(answer);
        
        return answer;
    }
}