import java.util.*;
public class SBuilder {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
       StringBuilder sb=new StringBuilder("Tony");
       System.out.println(sb);
       System.out.println(sb.charAt(0));
       sb.setCharAt(0,'p');
       System.out.println(sb);
       sb.insert(0,'S');
       System.out.println(sb);
       sb.delete(0,1);
       System.out.println(sb);
       sb.delete(1,3);
       System.out.println(sb);
       StringBuilder sbb=new StringBuilder("h");
       sbb.append("e");
       sbb.append("e");
       sbb.append("l");
       sbb.append("o");
       System.out.println(sbb);
    }
}
