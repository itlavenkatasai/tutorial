import java.util.*;
public class for8{
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.print("\n");
      }
    }
}