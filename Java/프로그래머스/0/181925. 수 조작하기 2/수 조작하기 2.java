class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 0; i < numLog.length - 1; i++){
            int compare = numLog[i] - numLog[i+1];
            answer += 
                compare == -1 ? "w" : compare == 1 ? "s" : compare == -10 ? "d" : "a";
        }
        return answer;
    }
}