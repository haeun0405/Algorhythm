import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> current = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            String name = line[0];
            String state = line[1];
            
            if (state.equals("enter")) {
                current.add(name);
            } else if (state.equals("leave")) {
                current.remove(name);
            }
        }
        
        TreeSet<String> sortedNames = new TreeSet<>((a, b) -> b.compareTo(a));
        sortedNames.addAll(current);

        for (String name : sortedNames) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}