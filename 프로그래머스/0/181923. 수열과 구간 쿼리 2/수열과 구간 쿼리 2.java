class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        
        for(int i = 0; i < answer.length; i++){
            int k = queries[i][2];
            int min = 1000000;
            
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                min = arr[j] > k && arr[j] < min ? arr[j] : min;
                // if(arr[j] > k){
                //     if(arr[j] < min){
                //         min = arr[j];          
                //     }
                // }
            }
            answer[i] = min == 1000000 ? -1 : min;
        }        
        
        return answer;
    }
}