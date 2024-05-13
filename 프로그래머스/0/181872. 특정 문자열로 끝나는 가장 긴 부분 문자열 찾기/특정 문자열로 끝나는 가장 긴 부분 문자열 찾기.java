class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = myString.length();
        
        while(!answer.endsWith(pat)){
            answer = myString.substring(0, idx);
            idx--;
        }
        
        return answer;
    }
}