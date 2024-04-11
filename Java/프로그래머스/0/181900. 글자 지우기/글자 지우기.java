class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");
        
        for(int i = 0; i < indices.length; i++){
            int n = indices[i];
            str[n] = str[n].replace(str[n], "");
        }
        
        for(int i = 0; i < str.length; i++){
            answer += str[i];
        }
        
        return answer;
    }
}