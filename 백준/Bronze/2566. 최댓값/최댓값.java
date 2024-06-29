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

        int[][] matrix = new int[9][9];
        int maxVal = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxCol = -1;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if (matrix[i][j] > maxVal) {
                    maxVal = matrix[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        bw.write(maxVal + "\n");
        bw.write(maxRow + " " + maxCol + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}