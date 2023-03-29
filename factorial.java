import java.util.*;
public class factorial {
    public static void main(String ar[]){
        Scanner s =new Scanner(System.in);
        System.out.println("enter a number to factorial");
        int n=s.nextInt();
        int i=n;
        int k=1;
while(i>=1){
    k=k*i;
    i--;
  
}
System.out.println(n+"! is: "+k);
    }
}
