package ReverseInteger;

class ReverseNumber {
    public int reverse(int x) {
        long rev=0;
        if(x>0){
            while(x>0){
                rev=rev*10+x%10;
                x=x/10;
            }
        }
        else{
            x*=-1;
            while(x>0){
                rev=rev*10+x%10;
                x=x/10;
            }
            rev*=-1;
        }
        if(rev > 2147483647||rev < -2147483647){
            rev = 0;
        }
        return (int)rev;
    }
}
