import java.util.Scanner;
public class TheatreSquare {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         long n = sc.nextLong();    
            long m = sc.nextLong();
            long a=sc.nextLong();
            long row=n/a;
            if(n%a!=0)
            row++;
            long col=m/a;
            if(m%a!=0)
            col++;
            System.out.println(row*col);
           
}
}
