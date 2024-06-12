import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        double A = Double.parseDouble(inputs[0]);
        double B = Double.parseDouble(inputs[1]);

        System.out.println(A / B);
    }
}
