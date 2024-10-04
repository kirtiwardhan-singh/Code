import java.util.*;

public class StringSol {
    public static void main(String[] args)
     {
        
    String s="mgntdygtxrvxjnwksqhxuxtrv";
     {
        int idx=0,i,k=-1;
        int f=0;
        for( i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(s.lastIndexOf(ch)>=0)
            {
                f=s.lastIndexOf(ch);
                String str=s.substring(i+1,f);
                if(str.length()>k)
                k=str.length();
               
            }
        }
        if(k==-1)
        System.out.println("-1");
      else
      System.out.println(k);

        
        
    }
}
}
