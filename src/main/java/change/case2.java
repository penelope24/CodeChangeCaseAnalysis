package change;

import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.Set;

public class case2 {

    public void f1 (Queue<Integer> marksQueue) {
        int Pass, Fail, Count;
        Pass = 0 ;
        Fail = 0 ;
        Count = 0 ;
        while (!marksQueue.isEmpty()) {
            int Marks = marksQueue.poll();
            if (Marks >= 40) {
                Pass = Pass + 1;
            }
            if (Marks < 40) {
                Fail = Fail + 1;
            }
            Count = Count + 1;
        }
        System.out.println(Pass);
        System.out.println(Fail);
        System.out.println(Count);
    }

    public void f2(Queue<Integer> queue) {
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

    public void f3() {
        Set<String> ss = new LinkedHashSet<>();
        for (String s : ss) {
            s += ",";
        }
        System.out.println(ss);
    }
}
