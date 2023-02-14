import java.util.Arrays;

public class pratice1 {
    public static void main(String[] args){
        int arr[]={1,2,13,4,5};
        int sum = 0;
        int sum1= 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            while(arr[i]>0){
                sum1 = sum1+arr[i]%10;
                arr[i]=arr[i]/10;

            }

        }
        System.out.print(Math.abs(sum1-sum));

    }
}