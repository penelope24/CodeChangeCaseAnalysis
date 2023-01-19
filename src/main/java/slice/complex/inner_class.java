package slice.complex;

public class inner_class {
    private inner in = new inner(0);

    private class inner{
        int a;

        public inner(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }
    }

    public void way() {
        System.out.println(in.getA());
    }
}
