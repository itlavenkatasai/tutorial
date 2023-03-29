public class fprime {
public static void main(String ar[]) {
    int n=11;
    int temp=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            temp++;
        }
    }
    if(temp==2){
        System.out.println(n+" is prime");
    }
    else{
        System.out.println(n+"is not prime");
    }
}   
}
