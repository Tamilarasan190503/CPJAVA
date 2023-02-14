import java.util.*;
class decendingorder{
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);
        int n=b.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=b.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
