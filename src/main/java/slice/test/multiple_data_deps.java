package slice.test;

public class multiple_data_deps {

    public void way() {
        int sum = 0;
        int product = 1;
        int w = 7;
        int i = 0;
        while (i < 10) {
            if (w == 7) {
                sum = sum + i;
            }
            product = product * i;
            i++;
        }
        write(sum+w);
        write(product);
    }

    private void write(Object o) {

    }
}
