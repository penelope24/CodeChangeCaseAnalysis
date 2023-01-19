package slice.basic;

import java.util.Queue;

public class case2 {

    public void way(Queue<Integer> queue) {
        int last = 10;
        int[] a = new int[last];
        String[] b = new String[last];
        for (int i=0; i<last; i++) {
            a[i] = 0;
            b[i] = String.valueOf(i);
            while (!queue.isEmpty()) {
                int t = queue.poll();
                if (t == 0) {
                    a[i] = a[i] +1;
                }
                else {
                    b[i] = String.valueOf(i+1);
                }
            }
        }
        System.out.println(a);
    }
}
