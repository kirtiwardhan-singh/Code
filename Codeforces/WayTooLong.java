import java.util.Scanner;
public class WayTooLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            String s=sc.next();
            int n=s.length();String s1="";
            if(n>10)
            {
                s1=s.charAt(0)+""+(n-2)+""+s.charAt(n-1);
                System.out.println(s1);
            }
            else
            {
                System.out.println(s);
            }
        }
        
      
    }
}
