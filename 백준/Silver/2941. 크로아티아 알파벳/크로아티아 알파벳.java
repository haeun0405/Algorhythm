import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String alphabet : croatianAlphabets) {
            input = input.replace(alphabet, "*");  // Replace each Croatian alphabet with a single character
        }

        int count = input.length();

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}