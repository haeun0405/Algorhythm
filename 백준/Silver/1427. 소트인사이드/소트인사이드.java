import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        
        char[] digits = N.toCharArray();
        
        Arrays.sort(digits);
        
        for (int i = digits.length - 1; i >= 0; i--) {
            bw.write(digits[i]);
        }
        bw.newLine();
        
        bw.flush();
        bw.close();
        br.close();
    }
}