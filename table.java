import java.util.*;
class table{
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a year");
        int n=s.nextInt();
        if(n%100==0||n%400==0&&n%100!=0||n%4==0){
            System.out.println(n+" " +"is a leap year");
        }
            else{
                System.out.println(n+" " +"is not a leap year");
            }
        }
    }

