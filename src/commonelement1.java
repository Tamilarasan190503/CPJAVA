import java.util.*;
public class commonelement1 {
    public static void main(String[] args) {
       // Scanner b = new Scanner(System.in);
        int arr1[] = {10, 1, 3, 5, 50, 20};
        int arr2[] = {20, 1, 3, 50, 10, 70};
        int arr3[] = {50, 1, 20, 5, 10, 80};
        int x=0,y=0,z=0;
        while(x<arr1.length&&y<arr2.length&&z<arr3.length){
            if(arr1[x]==arr2[y]&&arr2[y]==arr3[z]){
                System.out.print(arr1[x]);
                x++;
                y++;
                z++;
            }
            else if(arr1[x]>arr2[y]){
                y++;
            }
            else if(arr2[y]>arr3[z]){
                z++;
            }
            else{
                x++;
            }

        }


    }

}
