import java.util.*;
class natural{
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=0;
        for(int i=1;i<=n;i++){

            k=k+i;
        }
        System.out.println("sum "+n+" natural numbers is :"+k);
    }
}