class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int start1 = intervals[0][0], start2 = intervals[1][0];
        int end1 = intervals[0][1], end2 = intervals[1][1];
        
        answer = new int[end1 - start1 + end2 - start2 +2];
        
        for(int j = start1, i = 0; j <= end1; j++)
            answer[i++] = arr[j];
        
        for(int j = start2, i = end1 - start1 +1; j <= end2; j++)
            answer[i++] = arr[j];
        
        
        return answer;
    }
}