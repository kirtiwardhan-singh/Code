public class DuplicateNumber 
{
    public static int duplicate(int nums[])
    {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=i+1)
            {
                if(nums[i]!=nums[nums[i]])
                {
                    int t= nums[i];
                    nums[i]=nums[nums[i]];
                    nums[t]=t;
                }
                else
                return nums[i];
            }
            else 
            i++;
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int ar[]=new int[]{1,4,4,3,2};
        System.out.println(duplicate(ar));
    }
}
