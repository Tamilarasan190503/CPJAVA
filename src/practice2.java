import java.util.*;
public class practice2 {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        int n=Math.abs(a-b)+1;
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        while(a<=b){
            if(a%2==0){
                even.add(a);
            }
            else{
                odd.add(a);
            }
            a++;
        }

        int o = 0;
        int ev = even.size()-1;
        for(int k=0;k<n;k++) {
            if (even.size() > odd.size()) {
                if (ev >= 0) {
                    System.out.print(even.get(ev) + " ");
                    ev--;
                }
                if (o <= odd.size() - 1) {
                    System.out.print(odd.get(o) + " ");
                    o++;
                }
            } else if (odd.size() > even.size()) {
                if (o <= odd.size() - 1) {
                    System.out.print(odd.get(o) + " ");
                    o++;
                }
                if (ev >= 0) {
                    System.out.print(even.get(ev) + " ");
                    ev--;
                }
            }
        }
    }
}