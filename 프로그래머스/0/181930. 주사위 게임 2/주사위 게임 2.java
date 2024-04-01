class Solution {
    
    public int square(int num) {
        return num * num;
    }
    
    public int solution(int a, int b, int c) {
        int answer = 0;
        answer = 
            a == b && a == c ? (a + b + c) * (square(a) + square(b) + square(c)) * (square(a)*a + square(b)*b + square(c)*c) :
            a == b || a == c || b == c ? (a + b + c) * (square(a) + square(b) + square(c)) : a + b + c;
        return answer;
    }
}