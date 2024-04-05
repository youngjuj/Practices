class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(int i = 0; i < number.length(); i++){
            String num = "";
            num += number.charAt(i);
            answer += Integer.parseInt(num);
        }
        answer %= 9;
        
        return answer;
    }
}