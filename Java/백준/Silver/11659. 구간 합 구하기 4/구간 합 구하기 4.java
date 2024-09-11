import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 예제3) 구간 합 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arrayLen = Integer.parseInt(st.nextToken());
        int quizeLen = Integer.parseInt(st.nextToken());

        long[] arrayOfSum = new long[arrayLen +1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < arrayOfSum.length; i++) {
            arrayOfSum[i] = arrayOfSum[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < quizeLen; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            System.out.println(arrayOfSum[end] - arrayOfSum[start - 1]);
        }


    }
}