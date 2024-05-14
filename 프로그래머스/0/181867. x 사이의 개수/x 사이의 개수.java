class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] splitX = myString.split("x");
        
        answer = myString.endsWith("x") ? new int[splitX.length + 1] : new int[splitX.length];
        
        for(int i = 0; i < splitX.length; i++){
            answer[i] = splitX[i].length();
        }
        
        
        return answer;
    }
}