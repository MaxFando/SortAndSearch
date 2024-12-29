import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        List<ExampleInteger> intList = new ArrayList<>();
        intList.add(new ExampleInteger(1, 2, 3));
        intList.add(new ExampleInteger(4, 5, 6));
        intList.add(new ExampleInteger(7, 8, 9));

        List<ExampleString> strList = new ArrayList<>();
        strList.add(new ExampleString("a", "b", "c"));
        strList.add(new ExampleString("d", "e", "f"));
        strList.add(new ExampleString("g", "h", "i"));
        printList(intList);
        printList(strList);
    }
}

class ExampleInteger {
    int a;
    int b;
    int c;

    ExampleInteger(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return Integer.toString(a + b + c);
    }
}

class ExampleString {
    String s1;
    String s2;
    String s3;

    ExampleString(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return s1 + s2 + s3;
    }
}