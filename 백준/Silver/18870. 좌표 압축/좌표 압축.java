import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] original = new int[N];
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(input[i]);
        }

        int[] sorted = original.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> compress = new HashMap<>();
        int rank = 0;

        for (int i = 0; i < N; i++) {
            if (!compress.containsKey(sorted[i])) {
                compress.put(sorted[i], rank++);
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(compress.get(original[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}