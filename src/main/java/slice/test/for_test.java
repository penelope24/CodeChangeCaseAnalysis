package slice.test;

public class for_test {

    public void f1 (int a) {
        for (int i=0; i<a; i++) {
            System.out.println("for loop");
        }
        System.out.println("terminated");
    }

    public void f2 (int a) {
        for (int i=0; i<a; i++) {
            System.out.println("1st loop");
            int b = a + 1;
            for (int j=0; j<b; j++) {
                System.out.println("2nd loop");
            }
        }
        System.out.println("terminated");
    }
}
