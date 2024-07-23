import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxLimit = 1000000;
        boolean[] isPrime = new boolean[maxLimit + 1];
        
        for (int i = 2; i <= maxLimit; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i <= maxLimit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxLimit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            
            for (int p = 2; p <= N / 2; p++) {
                if (isPrime[p] && isPrime[N - p]) {
                    count++;
                }
            }
            
            bw.write(count + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}