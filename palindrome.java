import java.util.*;
class palindrome{
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number to check it is palindrome or not");
        int n=s.nextInt();
      int temp=0,rev=0,r;
     temp=n;
     while(n!=0){
        r=n%10;
        rev=rev*10+r;
        n=n/10;
     }
     if(temp==rev){
        System.out.println("this is palindrome number");
     }
     else{
        System.out.println("this is not palindrome");
     }
        

    }

}