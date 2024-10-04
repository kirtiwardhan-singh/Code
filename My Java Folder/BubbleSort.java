public class BubbleSort {
    public static void main(String[] args) {
        int ar[]={7,3,8,5,9,1,0,9};
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array");
        for(int i=0;i<ar.length;i++)
        {
        System.out.print(ar[i]+" ");
        }
    }
}
