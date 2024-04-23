class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[num_list.length];
        
        for(int i = 0, j = n; i < answer.length; i++){
            if(j >= answer.length){
                j = 0;
            }
            answer[i] = num_list[j++];
        }
        
        
        return answer;
    }
}