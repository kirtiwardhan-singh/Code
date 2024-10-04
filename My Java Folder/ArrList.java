import java.util.ArrayList;
import java.util.Collections;

public class ArrList 
{
    public static void main(String[] args)
    {
        // ArrayList<Integer>list=new ArrayList<Integer>();
        // list.add(9);
        // list.add(3);
        // list.add(14);
        // System.out.println(list);
        // list.add(1,14);
        // System.out.println(list);
        // list.set(2,27);
        // System.out.println(list);
        // list.remove(2);
        // System.out.println(list);
        // list.add(20);
        // Collections.sort(list);
        // for(int i=0;i<list.size();i++)
        // System.out.print(list.get(i)+" ");
        // System.out.println();
        
        ArrayList<Integer>l1=new ArrayList<Integer>();
        l1.add(9);
        l1.add(3);
     l1.add(14);
        ArrayList<Integer>l2=new ArrayList<Integer>();
        l2.add(9);
        l2.add(3);
     l2.add(14);
     ArrayList<ArrayList<Integer>>l=new ArrayList<>();
     l.add(l1);
     l.add(l2);
     System.out.println(l);
    }
}
