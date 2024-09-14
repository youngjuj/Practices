class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        String[] video_len_arr = video_len.split(":");
        String[] pos_arr = pos.split(":");
        String[] op_start_arr = op_start.split(":");
        String[] op_end_arr = op_end.split(":");
        
        int total = Integer.parseInt(video_len_arr[0]) * 60 + Integer.parseInt(video_len_arr[1]);
        int curr = Integer.parseInt(pos_arr[0]) * 60 + Integer.parseInt(pos_arr[1]);
        int op_s = Integer.parseInt(op_start_arr[0]) * 60 + Integer.parseInt(op_start_arr[1]);
        int op_e = Integer.parseInt(op_end_arr[0]) * 60 + Integer.parseInt(op_end_arr[1]);
        
        for(int i = 0; i < commands.length; i++){
            if(curr >= op_s && curr <= op_e){
            curr = op_e;
            }
            
            if(commands[i].equals("next")){
                curr += 10;
                curr = curr >= total ? total : curr;
            } else{
                curr -= 10;
                curr = curr <= 0 ? 0 : curr;
            }
        }
        
        if(curr >= op_s && curr <= op_e){
            curr = op_e;
        }
        
        int curr_mm = curr / 60;
        int curr_ss = curr % 60;
        
        answer = (curr_mm < 10 ? "0" + curr_mm : curr_mm) + ":" + (curr_ss < 10 ? "0" + curr_ss : curr_ss);
        
        
        return answer;
    }
}