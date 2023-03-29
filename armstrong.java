import java.util.*;
public class armstrong {
public static void main(String ar[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter a number to check it is armstrong or not");
    int n=s.nextInt();
    int rev=0,r;
    int temp=n;
    while(n>0){
        r=n%10;
        rev=rev+r*r*r;
        n=n/10;
    } 
    if(temp==rev){
        System.out.println("this is a armstrong number");
    }
    else{
        System.out.println("this is not a armstrong number");
    }
}   
}
