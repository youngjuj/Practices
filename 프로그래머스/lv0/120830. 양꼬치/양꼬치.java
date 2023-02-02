class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if(n >= 10) {
            int yang = n /10;
            k -= yang;
            answer = 12000 * n + k * 2000;
        } else {
            answer = 12000 * n + k * 2000;
        }
        return answer;
    }
}