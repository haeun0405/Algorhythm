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

        String input = br.readLine().trim();
        int count = (input.isEmpty() ? 0 : input.split("\\s+").length);
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}