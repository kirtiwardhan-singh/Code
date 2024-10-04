import java.util.*;

public class Input {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your name");
        // String nam=sc.nextLine();
        System.out.println("Learning java");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print('*');
             System.out.println();
        }
        // String name="Tony Stark";
        // System.out.println(name);
        System.out.println("Enter two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum =a+b;
        System.out.println("Sum is "+sum);
       
    }
}
