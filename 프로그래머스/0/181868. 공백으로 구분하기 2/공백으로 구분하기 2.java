class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String[] removed = {};
        String strAnswer = "";
        
        removed = my_string.split(" ");
        
        for(int i = 0; i < removed.length; i++){
            strAnswer += removed[i].equals("") ? "" : removed[i] + ",";
        }
        
        answer = strAnswer.split(",");
        
        return answer;
    }
}