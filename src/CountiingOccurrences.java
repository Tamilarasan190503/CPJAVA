import java.util.*;
class CountingOccurrences{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = 1245545;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
