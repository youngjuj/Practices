class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String ineq_eq = ineq + eq;
        boolean result = false;
        
        switch(ineq_eq) {
            case ">=":
                result = n >= m;
                break;
            case "<=":
                result = n <= m;
                break;
            case ">!":
                result = n > m;
                break;
            default:
                result = n < m;
                break;
        }
        answer = result ? 1 : 0;
        return answer;
    }
}