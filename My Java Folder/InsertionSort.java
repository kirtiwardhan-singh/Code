

public class InsertionSort {
    public static void main(String[] args) 
    {
        int ar[] = { 1, 5, 3, 8, 4, 9, 3, 0, 3 };
        for (int i = 1; i < ar.length; i++)
         {
            int current=ar[i];
            int j=i-1;
            while(j>=0&&current<ar[j])
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=current;
        }
        for(int i=0;i<ar.length;i++)
        System.out.print(ar[i]+" ");
    }
}
