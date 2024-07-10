import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result = 0;
        
        for (int M = Math.max(1, N - 81 * String.valueOf(N).length()); M < N; M++) {
            int sum = M;
            int current = M;
            
            while (current > 0) {
                sum += current % 10;
                current /= 10;
            }
            
            if (sum == N) {
                result = M;
                break;
            }
        }

        bw.write(String.valueOf(result));
        bw.newLine();
        
        bw.flush();
        bw.close();
        br.close();
    }
}