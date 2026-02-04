import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        while(n>0){
            if(n==0){
                fact=1;
            }else{
            fact=fact*n;
            n--;
            }
            
        }
        if(n<0){
            System.out.println("negative number does not have factorial");
        }else{
        System.out.println(fact);
        }
        sc.close();
    }
}
