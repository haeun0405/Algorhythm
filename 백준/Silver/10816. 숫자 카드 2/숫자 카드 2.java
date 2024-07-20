import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> cardCounts = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            cardCounts.put(num, cardCounts.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        int[] queries = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            queries[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            if (cardCounts.containsKey(queries[i])) {
                bw.write(cardCounts.get(queries[i]) + " ");
            } else {
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}