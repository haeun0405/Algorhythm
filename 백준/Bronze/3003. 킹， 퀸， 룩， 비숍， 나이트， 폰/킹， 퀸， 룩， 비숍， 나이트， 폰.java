import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] correctPieces = {1, 1, 2, 2, 2, 8};
        
        String[] input = br.readLine().split(" ");
        
        int[] result = new int[6];
        for (int i = 0; i < 6; i++) {
            result[i] = correctPieces[i] - Integer.parseInt(input[i]);
        }

        for (int i = 0; i < 6; i++) {
            bw.write(result[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}