public class MinimumWindowSort 
{
    public static int sorting(int ar[])
    {
        int n=ar.length;
        int low=0;
        int high=n-1;
        while(low<high && (ar[low]<=ar[low+1]))
        low++;
        while(low<high && (ar[high]>=ar[high-1]))
        high--;
        int min=ar[low];
        int max=ar[low];
        for(int i=low;i<=high;i++)
        {
            if(min>ar[i])
            min=ar[i];
            if(max<ar[i])
            max=ar[i];
        }
        while(low>0 && ar[low-1] > min)
        low--;
        while(high<n-1 && ar[high+1] < max  )
        high++;
        return high-low+1;
    }
    public static void main(String []args)
    {
        int []ar=new int[]{1,3,2,0,-1,7,10};
        
        System.out.println(sorting(ar));
    }

}
