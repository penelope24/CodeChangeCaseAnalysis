package slice.complex;

interface Age {
    int x = 21;
    int getAge();
}

public class anonymous {


    public void way() {
        Age age = new Age() {
            @Override
            public int getAge() {
                return x;
            }
        };
        System.out.println(age);
        int a = age.getAge();
    }
}
