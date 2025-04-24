import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("watermelon"));
        list1.add("Mango");
        list1.add("Orange");
        list1.add("Grapes");
        list1.add("Banana");
        list1.add("Dragon fruit");
        Collections.sort(list1);
        for (String i : list1) {
            System.out.println(i);
        }
    }
}
