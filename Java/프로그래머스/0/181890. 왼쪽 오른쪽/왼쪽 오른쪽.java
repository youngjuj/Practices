class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int l = 20, r = 20;
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                l = i; break;
            }else if(str_list[i].equals("r")){
                r = i; break;
            }
        }
        
        if(l != 20 && l-1 > 0){
            answer = new String[l];
            for(int i = 0; i < answer.length; i++)
                answer[i] = str_list[i];
        } else if(r != 20 && r+1 < str_list.length){
            answer = new String[str_list.length - (r+1)];
            for(int i = r+1, j = 0; i < str_list.length; i++)
                answer[j++] = str_list[i];
        }
        
        return answer;
    }
}