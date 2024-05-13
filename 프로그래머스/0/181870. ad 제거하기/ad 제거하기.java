class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        String strAnswer = "";
        
        for(int i = 0; i < strArr.length; i++){
            strAnswer += strArr[i].contains("ad") ? "" : strArr[i] + ",";
        }
        
        answer = strAnswer.split(",");
        
        return answer;
    }
}