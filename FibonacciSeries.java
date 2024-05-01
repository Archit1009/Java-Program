import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range to print fibonacci series");
        num=sc.nextInt();
        sc.close();
        FibonacciSeriess(num);


        }
        public static void FibonacciSeriess(int num){
            int a=0;
            int b=1;
            int c=1;
            System.out.println("That's is Fibonacciseries");
        
            for(int i=1;i<=num;i++){
             System.out.print(a +",  ");
                
                a=b;
                b=c;
                c=a+b;
                
                
            }
        }
    }



        
    

