import java.util.Scanner;
public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        for(int i=1;i<=n;i++)
        {
            String s=sc.next();
            if(s.equalsIgnoreCase("++X")|| s.equalsIgnoreCase("X++"))
            x++;
            else
            x--;
        }
        System.out.println(x);
    }
}
