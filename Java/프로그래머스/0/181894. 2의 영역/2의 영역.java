class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1, end = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                start = i;
                break;
            }
        }
        
        if(start >= 0){
            for(int i = start +1; i < arr.length; i++){
                if(arr[i] == 2){
                    end = i;
                }
            }
        }
        
        if(start < 0){
            answer = new int[] {start};
        } else if(end < 0){
            answer = new int[] {arr[start]};
        } else{
            answer = new int[end - start +1];
            
            for(int i = 0, j = start; j <= end; j++){
                answer[i++] = arr[j];
            }
        }
        
        
        
        return answer;
    }
}