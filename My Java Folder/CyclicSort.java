public class CyclicSort {
    public static void cyclic(int nums[])
    {
        int i;
        int j;
        for(i=0;i<nums.length;i++)
        {
            j=nums[i]-1;
            if(j==nums[j])
            continue;
            else
            {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
    }
    public static void main(String[] args) {
        int ar[]=new int[]{2,6,4,3,1,5};
        cyclic(ar);
        for(int i=0;i<ar.length;i++)
        System.out.print(ar[i]+" ");
    }
}
