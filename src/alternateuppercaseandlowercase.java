import java.util.*;
class alternateuppercaseandlowercase{
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);
        String s = b.nextLine();
        int n = b.nextInt();
        int count=0;
        int count1=0;
        String small="";
        String cap="";
        for(int i=0;i<s.length();i++){
            if(count<=n&&Character.isLowerCase(s.charAt(i))){
                small=small+s.charAt(i);
                count++;
            }
            else if(count1<=n&&Character.isUpperCase(s.charAt(i))){
                cap=cap+s.charAt(i);
                count++;

            }
        }
        for(int i=0;i<small.length();i++){
            System.out.print(small.charAt(i)+""+cap.charAt(i));
        }

    }
}

