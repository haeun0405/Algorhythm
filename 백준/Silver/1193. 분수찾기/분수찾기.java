import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        int crossCount = 1, prevSum = 0;

        while (true) {
            if (X <= prevSum + crossCount) {
                if (crossCount % 2 == 1) {
                    bw.write((crossCount - (X - prevSum - 1)) + "/" + (X - prevSum) + "\n");
                } else {
                    bw.write((X - prevSum) + "/" + (crossCount - (X - prevSum - 1)) + "\n");
                }
                break;
            } else {
                prevSum += crossCount;
                crossCount++;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}