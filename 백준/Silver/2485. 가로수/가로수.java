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
        int[] positions = new int[N];

        for (int i = 0; i < N; i++) {
            positions[i] = Integer.parseInt(br.readLine());
        }

        int[] gaps = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            gaps[i] = positions[i + 1] - positions[i];
        }

        int gcdValue = gaps[0];
        for (int i = 1; i < N - 1; i++) {
            gcdValue = gcd(gcdValue, gaps[i]);
        }

        int count = 0;
        for (int gap : gaps) {
            count += (gap / gcdValue) - 1;
        }

        bw.write(String.valueOf(count));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
