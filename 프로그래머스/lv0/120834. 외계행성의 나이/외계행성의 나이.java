class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = "";
        char[] nums = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        while(age > 0) {
            temp += nums[age % 10];
            age /= 10;
        }
        for(int i = temp.length() - 1; i >= 0; i--) {
            answer += temp.charAt(i);
        }
        return answer;
    }
}