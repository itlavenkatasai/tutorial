import java.util.*;
public class for7 {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print((j));
            }
            System.out.print("\n");
        }
    }
}