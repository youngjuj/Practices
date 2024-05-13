class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int start = 0;
        
        while(start < myString.length()){
            answer += myString.substring(start, myString.length()).startsWith(pat) ? 1 : 0;
            start++;
        }
        
        return answer;
    }
}