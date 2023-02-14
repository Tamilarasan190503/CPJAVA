import java.util.Scanner;

public class Trabonnic {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i=0;i<=n;i++){
            System.out.print(a+" ");
            int d = a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }

}
