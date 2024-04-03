import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        ArrayList<Integer> log = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(log.size() == 0)
                log.add(arr[i]);
            else if(log.get(log.size() - 1) < arr[i])
                log.add(arr[i]);
            else {
                log.remove(log.size() - 1);
                i--;
            }
        }
        
        stk = new int[log.size()];
        
        for(int i = 0; i < stk.length; i++)
            stk[i] = log.get(i).intValue();
        
        return stk;
    }
}