import java.util.Scanner;

public class duplicate {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean flag = false;
        int arr[]={1,2,3,3,4,4,5,5,5,4,6};
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Founded:"+arr[i]);
                    flag=true;
                }


            }

        }
        if(flag==false){
            System.out.print("No Duplicate");
        }

    }
}
