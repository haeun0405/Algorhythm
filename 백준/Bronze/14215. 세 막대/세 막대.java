import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int[] sides = {a, b, c};
        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) {
            bw.write(sides[0] + sides[1] + sides[2] + "\n");
        } else {
            sides[2] = sides[0] + sides[1] - 1;
            bw.write(sides[0] + sides[1] + sides[2] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}