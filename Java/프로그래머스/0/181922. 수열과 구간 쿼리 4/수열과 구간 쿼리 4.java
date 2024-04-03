class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j = s; j <= e; j++){
                arr[j] += j % k == 0 ? 1 : 0;
            }
        }
        
        answer = arr;
        
        return answer;
    }
}