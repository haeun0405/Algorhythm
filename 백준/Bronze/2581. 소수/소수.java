import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int minPrime = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (i < minPrime) {
                    minPrime = i;
                }
            }
        }

        if (sum == 0) {
            bw.write("-1\n");
        } else {
            bw.write(sum + "\n" + minPrime + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}