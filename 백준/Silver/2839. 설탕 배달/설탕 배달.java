import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int remainingWeight = N;

        while (remainingWeight >= 0) {
            if (remainingWeight % 5 == 0) {
                count += remainingWeight / 5;
                bw.write(String.valueOf(count));
                bw.newLine();
                bw.flush();
                bw.close();
                br.close();
                return;
            } else {
                remainingWeight -= 3;
                count++;
            }
        }

        bw.write("-1");
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}