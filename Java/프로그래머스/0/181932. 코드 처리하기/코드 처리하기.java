class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true; // 0일 때 true
        char[] codeArr = code.toCharArray();
        
        for(int i = 0; i < codeArr.length; i++){
            mode = codeArr[i] == '1' ? !mode : mode;
            
            if(codeArr[i] == '1') {
                continue;
            } else if(mode && i % 2 == 0){
                answer += codeArr[i];
            } else if(!mode && i % 2 != 0){
                answer += codeArr[i];
            }
            
        }
        
        
        return answer.length() == 0 ? "EMPTY" : answer;
    }
}