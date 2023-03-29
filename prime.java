import java.util.*;
class prime{
    public static void main(String ar[]){
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int temp=0;
     for(int i=1;i<=n;i++){
        if(n%i==0){
    temp++;
        }
     }
     if(temp==2){
        System.out.println(n +" is a prime number");
        System.out.println(n);
     }
     else{
        System.out.println(n +" is not a prime number");
     }
    }
}