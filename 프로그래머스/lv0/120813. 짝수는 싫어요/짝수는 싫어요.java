class Solution {
    public int[] solution(int n) {
        int num = 0;
        if (n % 2 == 0) {
        num = n / 2;
        } else {
        num = n / 2 + 1;
        }
        
        int[] answer = new int[num];
        for (int i = 0; i < num; i++){
            for (int j = i+1; j < i+2; j++) {
                answer[i] = i + j;
            }
        }
        return answer;
    }
}