package slice.complex;

import java.util.Random;

public class nested2 {

    public void way() {
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
