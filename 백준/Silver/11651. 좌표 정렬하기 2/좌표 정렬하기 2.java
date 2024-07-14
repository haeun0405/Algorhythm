import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            points[i] = new Point(x, y);
        }

        Arrays.sort(points, new Comparator<Point>() {
            public int compare(Point p1, Point p2) {
                if (p1.y == p2.y) {
                    return p1.x - p2.x;
                }
                return p1.y - p2.y;
            }
        });

        for (Point p : points) {
            bw.write(p.x + " " + p.y + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}