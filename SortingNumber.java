import java.util.Scanner;
public class SortingNumber {
    public static void main(String[] args)
     {

     Scanner scan=new Scanner(System.in);  
       int[] arr=new int[5];
       int tem;
       int k=5;
       for(int i=0;i<5;i++){
        arr[i]=scan.nextInt();
       }
       scan.close();
while(k!=0){
 for(int j=0;j<4;j++){
    if(arr[j]>arr[j+1]){
        tem=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=tem;
    }
 }
 k--;
}     
    
    for(int m=0;m<5;m++){
        System.out.println(arr[m]);
    }
}
    
}
