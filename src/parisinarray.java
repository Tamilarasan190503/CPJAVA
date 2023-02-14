import java.util.*;
public class parisinarray {
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        int sum = b.nextInt();
        int low =0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]>sum){
                high--;

            }
            if(arr[low]+arr[high]<sum){
                low++;
            }
            if(arr[low]+arr[high]==sum){
                System.out.println("pairs ("+arr[low]+","+arr[high]+")");
                low++;
                high--;
            }
        }


    }
}
