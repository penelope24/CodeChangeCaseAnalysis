package slice.complex;

import java.util.Queue;
import java.util.Random;

/**
 *  basic case, with a while loop & if conditions
 */
public class nested1 {

    void Marks(Queue<Integer> marksQueue) {
        int Pass, Fail, Count;
        Fail = 0 ;
        Count = 0 ;
        if (true) {
            Pass = 0 ;
            while (!marksQueue.isEmpty()) {
                int Marks = marksQueue.poll();
                if (Marks >= 40)
                    Pass = Pass + 1;
                if (Marks < 40)
                    Fail = Fail + 1;
                Count = Count + 1;
            }
        }
        System.out.println(Pass);
        System.out.println(Fail);
        System.out.println(Count);
    }

    public void way2() {
        int n = 100;
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        while (n > 0) {
            if (a > 10) {
                a++;
            }
            //
            if (b < 1) {
                b--;
            }
            for (int i=0; i<10; i++) {
                n--;
            }
        }
        System.out.println(a+b);
    }

}
