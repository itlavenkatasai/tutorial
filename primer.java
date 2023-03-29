import java.util.*;
class primer{
    public static void main(String ar[]){
     Scanner s=new Scanner(System.in);
     System.out.println("enter a number");
     int n=s.nextInt();
    for(int i=1;i<=n;i++){
       int temp=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                temp++; 
            }
        }
        if(temp==2){
            System.out.println(i);
        }
    }
  
}
}