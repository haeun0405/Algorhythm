import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (isGroupWord(s)) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();

        bw.close();
        br.close();
    }

    private static boolean isGroupWord(String s) {
        boolean[] arr = new boolean[26];
        char prevChar = '\0';

        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);

            if (prevChar != currentChar) {
                if (arr[currentChar - 'a']) {
                    return false;
                }
                arr[currentChar - 'a'] = true;
            }
            prevChar = currentChar;
        }

        return true;
    }
}