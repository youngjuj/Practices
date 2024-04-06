class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        answer = my_string;
        
        for(int[] query : queries){
            String temp = "";
            
            for(int i = query[1]; i >= query[0]; i--){
                temp += answer.charAt(i);
            }
            answer = my_string.substring(0, query[0]);
            answer += temp;
            answer += my_string.substring(query[1]+1);
            
            my_string = answer;
        }
        
        return answer;
    }
}