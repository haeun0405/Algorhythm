import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line1 = br.readLine().split(" ");
        int a1 = Integer.parseInt(line1[0]);
        int a0 = Integer.parseInt(line1[1]);

        int c = Integer.parseInt(br.readLine());

        int n0 = Integer.parseInt(br.readLine());

        boolean isSatisfy = true;
        for (int n = n0; n <= 100; n++) {
            if (a1 * n + a0 > c * n) {
                isSatisfy = false;
                break;
            }
        }

        bw.write(isSatisfy ? "1" : "0");
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}