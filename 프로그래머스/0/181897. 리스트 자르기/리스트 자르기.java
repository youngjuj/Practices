class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = n == 1 ? 0 : slicer[0];
        int b = n == 2 ? num_list.length -1 : slicer[1];
        int c = n == 4 ? slicer[2] : 1;
        
        answer = new int[(b-a)/c + 1];
        
        for(int i = 0, j = a; j <= b; j+= c){
            answer[i++] = num_list[j];
        }
        
        return answer;
    }
}