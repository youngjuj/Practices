class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        int[] arr_copy = arr;
        
        int start, end;
        
        for(int i = 0; i < query.length; i++){
            answer = i % 2 == 0 ? 
                new int[query[i]+1] : 
                new int[arr_copy.length - query[i]];
            start = i % 2 == 0 ? 0 : query[i];
            end = i % 2 == 0 ? answer.length: arr_copy.length;
            
            for(int r = 0, j = start; j < end; j++)
                    answer[r++] = arr_copy[j];
            arr_copy = answer;
        }
        return answer;
    }
}