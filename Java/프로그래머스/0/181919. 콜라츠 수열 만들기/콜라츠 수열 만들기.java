class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        String log = "" + n;
        
        while(true){
            if(n == 1) break;
            else if(n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            log += "," + n;
        }
        
        String[] logArr = log.split(",");
        answer = new int[logArr.length];
        
        for(int i = 0; i < answer.length; i++)
            answer[i] = Integer.parseInt(logArr[i]);       
        
        return answer;
    }
}