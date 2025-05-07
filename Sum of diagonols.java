import java.util.Scanner;
public class Main{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size of the square matrix:");
    int n = sc.nextInt();
    int[][]arr = new int[n][n];
    System.out.println("Enter the elements of the matrix:");
    for(int i =0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int leftsum = 0,rightsum = 0;
    for(int i =0;i<n;i++){
      leftsum + = arr[i][i];
      rightsum + = arr[i][n-1-i];
    }
    System.out.println("Sum of left Diagonal elements: " + rightsum);
  }
}
