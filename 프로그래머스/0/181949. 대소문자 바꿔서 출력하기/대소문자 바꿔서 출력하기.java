import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String newA = a.toUpperCase();
        String answer = "";
        
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != newA.charAt(i)) {
                answer += newA.charAt(i);
            } else{
                char b = a.charAt(i);
                answer += Character.toString(b).toLowerCase();
            }
        }
        System.out.println(answer);
    }
}