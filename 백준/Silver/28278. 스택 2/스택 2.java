import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.startsWith("1")) {
                int num = Integer.parseInt(input.split(" ")[1]);
                stack.push(num);
            } else if (input.equals("2")) {
                if (!stack.isEmpty()) {
                    bw.write(stack.pop() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (input.equals("3")) {
                bw.write(stack.size() + "\n");
            } else if (input.equals("4")) {
                bw.write((stack.isEmpty() ? 1 : 0) + "\n");
            } else if (input.equals("5")) {
                if (!stack.isEmpty()) {
                    bw.write(stack.peek() + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}