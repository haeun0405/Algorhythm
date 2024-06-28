import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().toUpperCase();
        int[] alphabetCount = new int[26];

        for (char c : input.toCharArray()) {
            alphabetCount[c - 'A']++;
        }

        int maxCount = 0;
        char maxChar = '?';
        boolean isDuplicate = false;

        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                maxChar = (char) (i + 'A');
                isDuplicate = false;
            } else if (alphabetCount[i] == maxCount) {
                isDuplicate = true;
            }
        }

        if (isDuplicate) {
            bw.write("?");
        } else {
            bw.write(maxChar);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}