import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr_copy = new int[arr.length];
        
        while(!Arrays.equals(arr, arr_copy)){
            
            for(int i = 0; i < arr.length; i++){
                arr_copy[i] = arr[i];
                arr[i] = arr[i] >= 50 && arr[i] % 2 == 0 ?
                    arr[i] / 2 : arr[i] < 50 && arr[i] % 2 != 0 ?
                        arr[i] * 2 + 1 : arr[i];
            }
            answer++;
        }
        
        answer--;
        
        return answer;
    }
}