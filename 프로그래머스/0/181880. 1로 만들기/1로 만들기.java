class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int num : num_list){
            while(true){
                if(num == 1) break;
                answer ++;
                num /= 2;
            }
        }
        
        return answer;
    }
}