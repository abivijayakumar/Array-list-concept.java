import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
class Main{
  public static void main(String[] args){
    Set<Integer>items = new TreeSet<Integer>();
    items.add(33);
    items.add(51);
    items.add(28);
    items.add(44);
    Iterator<Integer>value = items.iterator();
    while (value.hasNext()) {
      System.out.println(value.next());
    }
  }
}
