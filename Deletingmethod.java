import java.util.ArrayList;
public class main{
  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<>();
    names.add("Abi");
    names.add("praveen");
    names.add("hari");
    System.out.println("Before deletion: " + names);
    names.remove(1);
    names.remove("hari");
    System.out.println("After deletion: " + names);
  }
}
