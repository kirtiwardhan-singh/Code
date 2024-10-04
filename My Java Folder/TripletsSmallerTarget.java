import java.util.*;
public class TripletsSmallerTarget 
{
     public static int tripple(int ar[],int target)
    {
        int count =0;
        int l,r,i;
        for(i=0;i<ar.length-2;i++)
        {
            l=i+1;
            r=ar.length-1;
            int target_sum=target-ar[i];
            while(l<r)
            {
                if(ar[l]+ar[r]<target_sum)
                {
                    count=count+r-l;
                    l++;
                }
                else
                r--;
            }

        }
return count;
    }
    public static void main(String[] args) {
        int ar[]={-1,4,2,1,3};
        Arrays.sort(ar);
        System.out.println(tripple(ar,5));
        
    }
}
