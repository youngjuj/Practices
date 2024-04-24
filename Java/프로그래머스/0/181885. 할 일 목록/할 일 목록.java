class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int cnt = 0;
        
        for(boolean check : finished)
            cnt += !check ? 1 : 0;
        
        answer = new String[cnt];
        
        for(int i = 0, j = 0; i < todo_list.length; i++){
            if(!finished[i]) answer[j++] = todo_list[i];
        }
        
        
        return answer;
    }
}