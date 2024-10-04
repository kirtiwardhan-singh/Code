import java.util.ArrayList;
public class CorruptPair {
    public static ArrayList<Integer> corrupt(int []nums)
    {
        int i=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<nums.length)
        {
            if(nums[i]!=nums[nums[i]-1])
            {
                int t=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[t-1]=t;
            }
            else
            i++;
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                list.add(nums[i]);
                list.add(i+1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int ar[]=new int[]{3,1,2,3,6,4};
        System.out.println(corrupt(ar));
    }
    
}
