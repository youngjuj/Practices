class Solution {
    public int solution(int[] array) {
        int max = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        
        int[] nums = new int[max+1];
        for (int i : array) {
            nums[i]++;
        }
        
        int answer = 0;
        int up = 0;
        int down = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > up) {
                up = nums[i];
                answer = i;
            }
        }
        for (int i : nums) {
            if (i == up) {
                down++;
            }
        }
        if (down >= 2) {
            answer = -1;
        }

        return answer;
    }
}