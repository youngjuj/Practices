class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {

        int[] answer = {(denum1 * num2) + (denum2 * num1), num1 * num2};

        if (answer[0] == answer[1]) {
            answer[0] = 1;
            answer[1] = 1;
        } else if(answer[0] > answer[1]) {
            for (int i = answer[0]/2; i >= 2; i--) {
                if (answer[0] % i == 0 && answer[1] % i == 0) {
                    answer[0] /= i;
                    answer[1] /= i;
                }
            }
        } else if(answer[1] > answer[0]) {
            for (int i = answer[1]/2; i >= 2; i--) {
                if (answer[1] % i == 0 && answer[0] % i == 0) {
                    answer[0] /= i;
                    answer[1] /= i;
                }
            }
        }
        return answer;
    }
}