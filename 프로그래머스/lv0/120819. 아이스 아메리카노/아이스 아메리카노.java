class Solution {
    public int[] solution(int money) {
        
        int price = 5500;
        int max = money / price;
        
        int[] answer = {max, money % price};
        return answer;
    }
}