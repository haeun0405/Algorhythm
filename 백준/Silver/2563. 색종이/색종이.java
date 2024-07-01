import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] paper = new int[100][100];
        int N = Integer.parseInt(br.readLine());
        int totalArea = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int row = x; row < x + 10; row++) {
                for (int col = y; col < y + 10; col++) {
                    // 아직 색종이가 붙지 않은 부분에 대해서만 영역 증가
                    if (paper[row][col] == 0) {
                        paper[row][col] = 1;
                        totalArea++;
                    }
                }
            }
        }

        bw.write(totalArea + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}