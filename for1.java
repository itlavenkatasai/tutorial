import java.util.*;
public class for1 {
    public static void main(String ar[]){
  
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
    for(int i=0;i<=n;i++){
        for(int j=i++;j<n;j++){
            for(int k=1;k<=(n/2);k++){
                System.out.print(j);
            }
            for(int l=n;l>(n/2);l--){
                System.out.print(i);
            }
            System.out.println("\n");
    
        }
    }
    
}
}