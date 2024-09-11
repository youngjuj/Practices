import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long howMany = sc.nextInt();
        String given = sc.next();
        char[] givenArray = given.toCharArray();
        long answer = 0;
        
        for (char num: givenArray){
            answer += num - '0';
        }
        System.out.println(answer);
    }
}