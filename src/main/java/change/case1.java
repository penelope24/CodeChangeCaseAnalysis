package change;

import java.util.Queue;

public class case1 {

    public void func(Queue<Integer> queue) {
        int Pass, Fail, Count;
        if (queue.isEmpty()) {
            Pass = 0;
            Fail = 0;
            Count = 0;
        }
        else {
            Pass = 1;
            Fail = 1;
            Count = 1;
        }
        while (!queue.isEmpty()) {
            int Marks = queue.poll();
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
}
