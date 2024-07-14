import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> wordsSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            wordsSet.add(br.readLine());
        }

        List<String> wordsList = new ArrayList<>(wordsSet);
        Collections.sort(wordsList, (w1, w2) -> {
            if (w1.length() == w2.length()) {
                return w1.compareTo(w2);
            }
            return w1.length() - w2.length();
        });

        for (String word : wordsList) {
            bw.write(word + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}