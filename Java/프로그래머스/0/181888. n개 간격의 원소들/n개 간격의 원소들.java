class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = num_list.length % n == 0 ?
            new int[num_list.length / n] : new int[num_list.length / n +1];
        
        for(int j = 0, i = 0; i < num_list.length; i += n){
            answer[j++] = num_list[i];
        }
        
        return answer;
    }
}