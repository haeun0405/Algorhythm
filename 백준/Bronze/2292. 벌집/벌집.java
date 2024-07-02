import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        if (N == 1) {
            bw.write("1\n");
        } else {
            int layer = 1;
            int range = 2;
            while (range <= N) {
                range += 6 * layer;
                layer++;
            }
            bw.write(layer + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}