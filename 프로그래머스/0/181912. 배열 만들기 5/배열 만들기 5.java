class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        String nums = "";
        
        for(String str : intStrs){
            String temp = str.substring(s, s + l);
            int num = Integer.parseInt(temp);
            
            if(num > k) nums += num + (",");
        }
        
        String[] largerStr = nums.split(",");
        answer = new int[largerStr.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(largerStr[i]);
        }
        
        return answer;
    }
}