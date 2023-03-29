import java.util.*;
class for2{
    public static void main(String ar[]){
        Scanner s =new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==(n/2+1)||j==(n/2+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
          System.out.println("\n");
        }
    }
}