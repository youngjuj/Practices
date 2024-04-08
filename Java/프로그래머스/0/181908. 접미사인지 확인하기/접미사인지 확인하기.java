class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String str_suffix = "";
        String[] suffix = {};
        
        for(int i = 0; i < my_string.length(); i++){
            str_suffix += my_string.substring(i) + ",";
        }
        
        suffix = str_suffix.split(",");
        
        for(int i = 0; i < suffix.length; i++){
            if(is_suffix.equals(suffix[i])){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}