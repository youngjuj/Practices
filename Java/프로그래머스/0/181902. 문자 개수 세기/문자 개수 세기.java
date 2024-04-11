class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        char[] alphabets = new char[52];
        
        for(int i = 0; i < 26; i++)
            alphabets[i] = (char)('A' + i);
        
        for(int i = 26; i < 52; i++)
            alphabets[i] = (char)('a' + (i-26));
        
        answer = new int[alphabets.length];
        
        for(int i = 0; i < my_string.length(); i++)
            for(int j = 0; j < alphabets.length; j++)
                if(my_string.charAt(i) == alphabets[j]){
                    answer[j]++;
                    break;
                }
        return answer;
    }
}