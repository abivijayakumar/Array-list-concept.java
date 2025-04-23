import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    ArrayList <Integer> al = new ArrayList<>();
    al.add(1);
    al.add(69);
    al.add(40);
    Integer[] arr = new Integer[al.size()];
    al.toArray(arr);
    for(int i:arr){
      System.out.println(i+ " ");
    }
  }
