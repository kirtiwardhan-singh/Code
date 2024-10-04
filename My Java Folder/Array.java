import java.util.*;
public class Array {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int marks[]=new int[10];
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
        marks[i]=sc.nextInt();
        System.out.println("Printing the Elements");
         for(int i=0;i<10;i++)
        System.out.print(marks[i]+" ");
        

    }
}
