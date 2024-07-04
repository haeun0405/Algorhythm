import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        if (N > 1) {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                while (N % i == 0) {
                    bw.write(i + "\n");
                    N /= i;
                }
            }
            if (N > 1) {
                bw.write(N + "\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}