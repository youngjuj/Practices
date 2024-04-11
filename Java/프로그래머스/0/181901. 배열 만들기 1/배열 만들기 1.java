class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        String[] nums = {};
        String num = "";
        
        for(int i = 1; i <= n; i++){
            if(i % k == 0) num += i + ",";
        }
        
        nums = num.split(",");
        answer = new int[nums.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(nums[i]);
        }
        
        
        return answer;
    }
}