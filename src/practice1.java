import java.util.*;
public class practice1 {
    public static void main(String[] args){
        Scanner b=new Scanner(System.in);
        int n = b.nextInt();
        int a=20;
        int x=60;
        System.out.print(a+" ");
        System.out.print(x+" ");
        for(int i=1;i<n-1;i++){
            a=x+40+4*i;
            x=a;

            System.out.print(a+" ");
        }
    }
}
