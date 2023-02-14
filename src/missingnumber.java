import java.util.*;
public class missingnumber {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int sum1=0;
       int sum2=0;
       int arr[]={1,2,3,4,6};
       for(int i=0;i<arr.length;i++){
           sum1=sum1+arr[i];
       }
       System.out.println("Sum of element in array:"+sum1);
       for(int i=0;i<=6;i++){
           sum2=sum2+i;
       }
       System.out.println("Sum of range in array:"+sum2);
       System.out.println("Sum of missing element array:"+(sum2-sum1));
    }
}
