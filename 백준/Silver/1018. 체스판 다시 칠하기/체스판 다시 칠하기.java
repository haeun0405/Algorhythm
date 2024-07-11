import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] dimensions = br.readLine().split(" ");
        int N = Integer.parseInt(dimensions[0]);
        int M = Integer.parseInt(dimensions[1]);
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minChanges = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minChanges = Math.min(minChanges, calculateMinChanges(board, i, j));
            }
        }

        bw.write(Integer.toString(minChanges));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }

    private static int calculateMinChanges(char[][] board, int startRow, int startCol) {
        int changes1 = 0;
        int changes2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expectedChar = ((i + j) % 2 == 0) ? 'W' : 'B';
                if (board[startRow + i][startCol + j] != expectedChar) {
                    changes1++;
                }
                if (board[startRow + i][startCol + j] != (expectedChar == 'W' ? 'B' : 'W')) {
                    changes2++;
                }
            }
        }

        return Math.min(changes1, changes2);
    }
}