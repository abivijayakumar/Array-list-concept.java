import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    ArrayList<Integer>num1 = new ArrayList<>();
    num1.add(15);
    num1.add(27);
    num1.add(3);
    num1.add(2);
    num1.add(4);
    for (int num : num1) { 
      if (num % 2 == 0) {
        System.out.println(num + " is even");
      }
    }
  }
}
