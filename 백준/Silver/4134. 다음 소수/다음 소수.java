import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            long n = Long.parseLong(br.readLine());
            if (n <= 2) {
                bw.write("2\n");
            } else {
                if (n % 2 == 0) n++;
                while (!isPrime(n)) n += 2;
                bw.write(n + "\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(long n) {
        if (n % 2 == 0) return n == 2;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}