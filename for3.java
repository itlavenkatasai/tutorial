import java.util.*;
public class for3 {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
