import java.util.LinkedList;
public class LinkedL {
    public static void main(String[] args) 
    {
        LinkedList <String> list=new LinkedList();
        LinkedList <String> l1=new LinkedList();
        list.add("Kirti ");
        list.add("Wardhan ");
        list.add("Singh ");
        l1.add("Geeks");
        l1.add("for");
        l1.add("Geeks");
        System.out.println(list);
        list.addAll(l1);
        System.out.println(list);
    }
}
