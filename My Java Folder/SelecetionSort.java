public class SelecetionSort {
    public static void main(String args[])
    {
        int ar[]={6,3,8,2,9,0,1,4};
        int temp,f=0;
        for(int i=0;i<ar.length;i++)
        {
            temp=i;
            for(int j=i;j<ar.length;j++)
            {
                if(ar[temp]>ar[j])
                {
                    temp=j;
                    f=1;
                }
            }
            if(f==1)
            {
                f=ar[i];
                ar[i]=ar[temp];
                ar[temp]=f;
                f=0;
            }
        }
        for(int i=0;i<ar.length;i++)
        System.out.print(ar[i]+" ");
    }
}
