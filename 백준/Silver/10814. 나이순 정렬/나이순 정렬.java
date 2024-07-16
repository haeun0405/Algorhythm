import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static class Member {
        int age;
        String name;
        int joinOrder;

        public Member(int age, String name, int joinOrder) {
            this.age = age;
            this.name = name;
            this.joinOrder = joinOrder;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members[i] = new Member(age, name, i);
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if (m1.age == m2.age) {
                    return m1.joinOrder - m2.joinOrder;
                }
                return m1.age - m2.age;
            }
        });

        for (Member m : members) {
            bw.write(m.age + " " + m.name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}