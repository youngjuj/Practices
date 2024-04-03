class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        String result = "";
        
        for(int i = l; i <= r; i++){
            String num = Integer.toString(i);
            String temp = "";
            for(int j = 0; j < num.length(); j++){
                if(num.charAt(j) == '5' || num.charAt(j) == '0')
                    temp += num.charAt(j);
            }
            if(temp.length() == num.length())
                result += num + ",";
        }
        
        String[] resultArr = result.split(",");
        if(resultArr[0] == "") resultArr[0] = "-1";
        
        answer = new int[resultArr.length];
        
        for(int i = 0; i < resultArr.length; i++){
            answer[i] = Integer.parseInt(resultArr[i]);
        }
        
        return answer;
    }
}