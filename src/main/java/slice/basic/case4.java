package slice.basic;

import java.util.Queue;

public class case4 {

    public void way(Queue<Integer> queue) {
        int last = 10;
        int a = 0;
        int i = 0;
        while (i < last) {
            a = 0;
            while (!queue.isEmpty()) {
                int t = queue.poll();
                if (t == 0) {
                    a = a + 1;
                }
                else {
                    a = a - 1;
                }
            }
            i++;
        }
        System.out.println(a);
    }
}
