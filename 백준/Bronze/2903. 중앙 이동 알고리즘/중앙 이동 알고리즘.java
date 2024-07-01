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

        int pointsPerSide = 2;

        for (int i = 0; i < N; i++) {
            pointsPerSide = 2 * pointsPerSide - 1;
        }

        int totalPoints = pointsPerSide * pointsPerSide;

        bw.write(totalPoints + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}