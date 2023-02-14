import java.util.*;
public class commonelement {
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);
        int arr1[]={10,1,3,5,50,20};
        int arr2[]={20,1,3,50,10,70};
        int arr3[]={50,1,20,5,10,80};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                for(int k=0;k<arr3.length;k++){
                    if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]&&arr1[i]==arr3[k]){
                        System.out.print(arr1[i]+" ");
                    }
                }
            }
        }
    }
}
