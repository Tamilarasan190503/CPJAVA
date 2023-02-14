import java.util.*;
public class arrangestring {
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);
        String s =b.nextLine();
        int n = b.nextInt();
        String s1="";
        String s2 ="";
        if(n>s.length()){
            System.out.print("Invalid Output");
            System.exit(0);
        }
        for(int i=0;i<n;i++){
            s1+=s.charAt(i)+"";

        }
        for(int j=n;j<s.length();j++){
            s2+=s.charAt(j)+"";

        }
        s=s2+s1;
        System.out.print(s);
    }
}
