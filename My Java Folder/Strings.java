import java.util.*;
public class Strings {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //String name="Tony";
       String fuName="Tony Stark";
       String sentence="My name is Tony Stark"; 
       String user;
    //    System.out.println("Enter your name");
    //    user=sc.nextLine();
    //    System.out.println("Your name is "+user);
       //concatination
    //    String firstName="Kirti ";
    //    String lastName="Wardhan";
    //    String fullName=firstName+lastName;
    //    System.out.println("Your full name is "+fullName);
    //    System.out.println(fullName.length());
    //    for(int i=0;i<fullName.length();i++)
    //    {
    //     System.out.print (fullName.charAt(i)+" ");
    //    }
    //    System.out.println();
    //    String name1="Tony";
    //    String name2="Tony";
    //    if(name1.compareTo(name2)==0)
    //    {
    //     System.out.println("Strings are equal");
    //    }
    // }
    String name=sentence.substring(5,sentence.length());
    System.out.println(name);
}
}
