public class arm {
    public static void main(String ar[]){
        int n=539,rev=0,r;
        int temp=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev){
            System.out.println(temp+" is palindrome");
        }
        else{
            System.out.println(temp+" is not palindrome");
        }
    }
}
