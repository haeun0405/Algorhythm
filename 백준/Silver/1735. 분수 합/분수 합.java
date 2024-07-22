import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstFraction = br.readLine().split(" ");
        int A1 = Integer.parseInt(firstFraction[0]);
        int B1 = Integer.parseInt(firstFraction[1]);

        String[] secondFraction = br.readLine().split(" ");
        int A2 = Integer.parseInt(secondFraction[0]);
        int B2 = Integer.parseInt(secondFraction[1]);

        int numerator = A1 * B2 + A2 * B1;
        int denominator = B1 * B2;

        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        bw.write(numerator + " " + denominator + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int gcd(int a, int b) {
        while ( b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}