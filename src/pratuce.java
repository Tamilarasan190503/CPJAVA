import java.util.Arrays;

class pratuce {
    public static void main(String[] args){
        int nums[]={0,1,2,3,4};
        int index[]={0,1,2,2,1};
        int target[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(index[i]==i){
                target[index[i]]=nums[i];

            }
            else{
                for(int j=index[i];j<i+1;j++){
                    int temp=target[j];
                    target[j]=nums[i];
                    nums[i]=temp;
                }
            }

        }
       System.out.print(Arrays.toString(target));
    }
}
