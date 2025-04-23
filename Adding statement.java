import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(2);

        list1.addAll(list2);
        System.out.println("Merged Array: " + list1);
    }
}
