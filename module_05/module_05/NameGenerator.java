import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameGenerator {
    public static void main(String[] args) {
        String[] peoples = {"Bob","Jill","Tom","Brandon"};
        List<String> names = Arrays.asList(peoples);
        Collections.shuffle(names);
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}