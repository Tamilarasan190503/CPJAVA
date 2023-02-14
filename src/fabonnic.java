import java.util.Scanner;

public class fabonnic {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int first = 0;
        int second = 1;
        for(int i = 0;i<n;i++){
            System.out.print(first+" ");
            int total = first + second;
            first = second;
            second = total;
        }

        /*int n = s.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }

        System.out.println(b);*/


    }
}
