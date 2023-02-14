import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = 50;
        int b = 100;
        System.out.println("Before swap"+a+" "+b);
        int c = a;
        a = b;
        b=c;
        System.out.println("After swap"+a+" "+b);
    }
}
