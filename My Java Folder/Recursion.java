
public class Recursion 
{
    public static int fibo(int n)
     {
        if(n==0||n==1)
        return n;
        else
        return fibo(n-1)+fibo(n-2);
    }
    public static void numbers(int n)
    {
        if(n==0)
        return ;
       System.out.print(n+ " ");
        numbers(n-1);
    }

     public static void numbersAsc(int n)
    {
        if(n==0)
        return ;
        numbersAsc(n-1);
         System.out.print(n+ " ");
        

    }

    public static int sum(int n)
    {
        if(n==1)
        return n;
        return  n+ sum(n-1);
    }
    public static int fact(int n)
     {
        if(n==1)
        return 1;
        return n*fact(n-1);
        
    }

    public static int pow(int x,int n)
    {
        if(n==0)
        return 1;
        return x*pow(x,n-1);
    }
        public static int powLogN(int x,int n)
    {
        if(n==0)
        return 1;
        if(x==0)
        return 0;
        if(n%2==0)
        return powLogN(x,n/2)*powLogN(x, n/2);
        else
        return x*powLogN(x,n/2)*powLogN(x,n/2);
    }

    public static void main(String[] args) 
    {
        // for(int i=0;i<8;i++)
        // System.out.print(fibo(i)+" ");
        System.out.println(powLogN(5,3));
    }
}
