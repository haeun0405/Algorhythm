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
        long N = Long.parseLong(input[0]);
        int B = Integer.parseInt(input[1]);

        String result = convertToBase(N, B);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    private static String convertToBase(long number, int base) {
        StringBuilder sb = new StringBuilder();
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (number > 0) {
            int remainder = (int) (number % base);
            sb.append(chars.charAt(remainder));
            number /= base;
        }

        return sb.reverse().toString();
    }
}