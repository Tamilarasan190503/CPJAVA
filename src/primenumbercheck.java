import java.util.Scanner;

public class primenumbercheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        if(n>1){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(n==2){
                System.out.println("prime number");
            }
            else{
                System.out.println("Not a prime Number");
            }
        }
    }
}
