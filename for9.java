import java.util.*;
public class for9 {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n/2;j++){
                System.out.print(i);
            }
            for(int k=i+1;k<=i+1;k++){
             for(int l=1;l<=n/2;l++){
                System.out.print(k);
             }
            }
            System.out.print("\n");
        }
    }
}
