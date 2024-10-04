public class MmissingNumber {
    public static int missing(int nums[])
    {
        int i=0;
        int j;
        while(i<nums.length)
        {
            if(nums[i]<nums.length && nums[i]!=nums[nums[i]])
            {
                
                int t= nums[i];
                nums[i]=nums[nums[i]];
                nums[t]=t;

            }
            else
            i++;
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            return i;
        }
        return 0;
    }
    public static void main(String[] args)
     {
        int ar[]=new int[]{4,0,3,1};
        System.out.println(missing(ar));
    }
}
