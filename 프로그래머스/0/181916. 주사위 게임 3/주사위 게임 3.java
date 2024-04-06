import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] nums = {a, b, c, d};
        
        int[] unique = Arrays.stream(nums).distinct().toArray();
        int[] cnt = new int[unique.length];
        
        for(int i = 0; i < unique.length; i++){
            for(int j = 0; j < nums.length; j++){
                cnt[i] += unique[i] == nums[j] ? 1 : 0;
            }
        }
        
        if(unique.length == 4) {
            int min = 6;
            
            for(int i = 0; i < unique.length; i++){
                min = unique[i] < min ? unique[i] : min;
            }
            answer = min;
            
        } else if(unique.length == 3) {
            
            answer = 1;
            for(int i = 0; i < unique.length; i++){
                if(cnt[i] == 1) answer *= unique[i];
            }
            
        } else if(unique.length == 2) {
            
            if(cnt[0] == 3){
                answer = (unique[0] * 10 + unique[1]) * (unique[0] * 10 + unique[1]);
                
            }else if(cnt[1] == 3){
                answer = (unique[1] * 10 + unique[0]) * (unique[1] * 10 + unique[0]);
                
            }else{
                answer = (unique[0] + unique[1]) * (unique[0] - unique[1]);
                answer *= answer < 0 ? -1 : 1;
            } 
            
        } else if(unique.length == 1){
            answer = 1111 * unique[0];
        }
        
        return answer;
    }
}