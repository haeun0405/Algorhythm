import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeA = Integer.parseInt(st.nextToken());
        int sizeB = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeA; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeB; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> symmetricDiff = new HashSet<>(setA);
        symmetricDiff.addAll(setB);
        for (Integer elem : setA) {
            if (setB.contains(elem)) {
                symmetricDiff.remove(elem);
            }
        }
        for (Integer elem : setB) {
            if (setA.contains(elem)) {
                symmetricDiff.remove(elem);
            }
        }

        bw.write(Integer.toString(symmetricDiff.size()));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}