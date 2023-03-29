import java.util.*;
public class power {
    public static void main (String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a first  number");
        int a=s.nextInt();
        int c=1;
        System.out.println("enter a second number");
        int b=s.nextInt();
        for(int i=1;i<=b;i++){
         c=c*a; 
        }
        System.out.println(a+"power of "+b+"is: "+c);
    }
}
