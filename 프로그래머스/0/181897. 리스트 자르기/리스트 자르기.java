class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0], b = slicer[1], c = 1;
        String log = "";
        String[] log_arr = {};
        
        switch( n ){
            case 1:
                a = 0; break;
            case 2:
                b = num_list.length - 1; break;
            case 4:
                c = slicer[2]; break;
        }
        
        answer = new int[(b-a)/c +1];

        
        for(int j = a; j <= b; j+= c){
            log += num_list[j]+",";
        }
        
        log_arr = log.split(",");
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(log_arr[i]);
        }
        
        
        return answer;
    }
}