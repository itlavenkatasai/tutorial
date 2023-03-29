import java.util.*;
class palindromes{
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        int r,temp,rev=0;
        for(int i=1;i<=num;i++){
            temp=i;
            while(i!=0){
            r=i%10;
            rev=rev*10+r;
            i=i/10;
            }
            if(rev==i){
                System.out.println(temp);
            }
            rev=0;
        }
        


    }
}