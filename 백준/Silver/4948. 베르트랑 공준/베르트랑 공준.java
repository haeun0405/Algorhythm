import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int maxN = 123456;
        int maxLimit = 2 * maxN;
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
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            
            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i]) count++;
            }
            
            bw.write(count + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}