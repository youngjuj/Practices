class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0};
        if(denom1 == denom2) {
            answer[0] = numer1 + numer2;
            answer[1] = denom1;
        } else if(numer1 == 0) {
            answer[0] = numer2;
            answer[1] = denom2;
        }  else if(numer2 == 0) {
            answer[0] = numer1;
            answer[1] = denom1;
        } else if(denom1 == 1) {
            answer[0] = numer1 * denom2 + numer2;
            answer[1] = denom2;
        } else if (denom2 == 1) {
            answer[0] = numer2 * denom1 + numer1;
            answer[1] = denom1;
        } else {
            answer[0] = numer1 * denom2 + numer2 * denom1;
            answer[1] = denom1 * denom2;
        }
        
        for(int i = answer[1]; i > 0; i--) {
                if(answer[0] % i == 0 && answer[1] % i == 0) {
                    answer[0] /= i;
                    answer[1] /= i;
            }
        }
        return answer;
    }
}