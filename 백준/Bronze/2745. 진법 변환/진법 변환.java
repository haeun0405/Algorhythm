import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String N = input[0];
        int B = Integer.parseInt(input[1]);

        long decimalValue = convertToDecimal(N, B);

        bw.write(decimalValue + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    private static long convertToDecimal(String N, int B) {
        long result = 0;
        int length = N.length();

        for (int i = 0; i < length; i++) {
            char c = N.charAt(i);
            int digit = 0;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'Z') {
                digit = c - 'A' + 10;
            }
            result = result * B + digit;
        }

        return result;
    }
}