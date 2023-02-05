class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = new int[emergency.length];
        int num = 0;
        
        // 순서정렬
        temp = emergency.clone();
        
        for(int i = 0; i < emergency.length - 1; i++) {
            for(int j = i + 1; j < emergency.length; j++) {
                if(temp[i] < temp[j]) {
                    num = temp[i];
                    temp[i] = temp[j];
                    temp[j] = num;
                }
            }
        }
        
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] == temp[j]) {
                    answer[i] = j + 1;
                }
            }
        }
        
        
        return answer;
    }
}