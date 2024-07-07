import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {
            String[] input = line.split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                bw.write("Invalid\n");
            } else if (a == b && b == c) {
                bw.write("Equilateral\n");
            } else if (a == b || b == c || a == c) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}