import java.util.*;
public class primeNumber{
    public static void main(String args[]){
         System.out.print("enter n :");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        
        if(n==2){
            System.out.println(n + " is Prime Number");
        }else if(n==1){
            System.out.println(n + " is not a Prime Number");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println(n + " is Prime Number");
            }else{
                System.out.println(n + " is not a Prime Number");
            }
        }
        
        sc.close();
    }
}