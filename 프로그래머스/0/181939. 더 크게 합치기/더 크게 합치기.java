class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int a_b = Integer.parseInt("" + a + b);
        int b_a = Integer.parseInt("" + b + a);
        
        answer = a_b >= b_a ? a_b : b_a;
        return answer;
    }
}