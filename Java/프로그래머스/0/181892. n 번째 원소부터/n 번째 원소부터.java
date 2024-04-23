class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        answer = new int[num_list.length+1 - n];
        
        for(int i = 0, j = n-1; j < num_list.length; j++){
            answer[i++] = num_list[j];
        }
        
        return answer;
    }
}