package slice.test;

public class switch_test {

    public void f1 (int a) {
        while (true) {
            switch (a) {
                case 0:
                    System.out.println(a);
//                    break;
                case 1:
                    System.out.println("no break out");
                    break;
                case 2:
                    throw new IllegalStateException("");
                default:
                    throw new IllegalStateException("123");
//                    System.out.println(a);
            }
        }
    }

//    public void f2(int a) {
//        try {
//            int b = a + 1;
//            switch (b) {
//                case 0:
//                    System.out.println(a);
//                    break;
//                case 1:
//                    System.out.println(b);
//                    break;
//                default:
//                    throw new IllegalStateException("ex");
//            }
//        } catch (Exception e) {
//            throw new IllegalStateException(e);
//        }
//    }
}
