import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check weather number is prime or not");
        n=sc.nextInt();
        if(isprime(n)==false){
            System.out.println("this number is not prime ");
        }
        else{
            System.out.println("this number is prime");
        }
    

        
    }
    public static boolean  isprime(int n){
        if(n==0 || n==1){
            return false;
        }
        else if (n==2){
            return true;
        }
        else{
            for(int i=2;i<=n/2;i++){
                if(n%2==0){
                    return false;
                }
            }
        }
        return true;
    }
    
}
