package slice.basic;

import java.util.Queue;

public class case3 {

    public void way(Queue<Integer> queue) {
        int last = 10;
        int[] a = new int[last];
        String[] b = new String[last];
        int i = 0;
        while (i < last) {
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
            i++;
        }
        System.out.println(a);
    }
}
