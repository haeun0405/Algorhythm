import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int totalSeconds = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            totalSeconds += getDialTime(c);
        }

        bw.write(totalSeconds + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int getDialTime(char c) {
        if (c >= 'A' && c <= 'C') return 3;
        else if (c >= 'D' && c <= 'F') return 4;
        else if (c >= 'G' && c <= 'I') return 5;
        else if (c >= 'J' && c <= 'L') return 6;
        else if (c >= 'M' && c <= 'O') return 7;
        else if (c >= 'P' && c <= 'S') return 8;
        else if (c >= 'T' && c <= 'V') return 9;
        else if (c >= 'W' && c <= 'Z') return 10;
        else return 0;
    }
}