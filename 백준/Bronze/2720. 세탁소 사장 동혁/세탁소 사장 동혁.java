import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int cents = Integer.parseInt(br.readLine());
            int[] coins = calculateCoins(cents);
            bw.write(coins[0] + " " + coins[1] + " " + coins[2] + " " + coins[3] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int[] calculateCoins(int cents) {
        int[] coins = new int[4];
        int[] values = {25, 10, 5, 1};

        for (int i = 0; i < values.length; i++) {
            coins[i] = cents / values[i];
            cents %= values[i];
        }

        return coins;
    }
}