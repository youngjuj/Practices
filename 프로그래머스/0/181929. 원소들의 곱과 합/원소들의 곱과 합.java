class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum_square = 0;
        int mul_all = 1;
        
        for(int i = 0; i < num_list.length; i++){
            sum_square += num_list[i];
            mul_all *= num_list[i];
        }
        
        answer = mul_all < sum_square * sum_square ? 1: 0;
        return answer;
    }
}