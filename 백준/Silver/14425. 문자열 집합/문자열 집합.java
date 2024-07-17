import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        
        HashSet<String> setS = new HashSet<>();

        for (int i = 0; i < N; i++) {
            setS.add(br.readLine());
        }

        int count = 0;
        
        for (int i = 0; i < M; i++) {
            if (setS.contains(br.readLine())) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.newLine();
        
        bw.flush();
        bw.close();
        br.close();
    }
}