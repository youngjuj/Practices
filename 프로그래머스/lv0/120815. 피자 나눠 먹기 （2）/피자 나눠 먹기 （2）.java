class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 6; i <= 6 * n; i++) {
            if(i % n == 0 && i % 6 == 0) {
                answer = i / 6;
                break;
            }
        }
        return answer;
    }
}