import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String sc = s.next();
        for(int i=sc.length()-1;i>=0;i--){
            System.out.print(sc.charAt(i));
        }
    }
}
