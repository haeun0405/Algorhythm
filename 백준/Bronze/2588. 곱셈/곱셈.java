import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append(A * (B % 10));
        sb.append("\n");
        
        sb.append(A * ((B % 100) / 10));
        sb.append("\n");
        
        sb.append(A * (B / 100));
        sb.append("\n");
        
        sb.append(A * B);
        
        System.out.println(sb);
    }
}
