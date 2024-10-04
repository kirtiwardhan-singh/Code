import java.util.HashSet;

public class ContainsDuplicate {
    public static int duplicate(int nums[]) {

        HashSet<Integer> ar=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(ar.contains(nums[i]))
            return 1;
            ar.add(nums[i]);
        }
        return 0;

    }
    public static void main(String[] args) {
        int ar[]=new int []{1,2,3,4};
        if(duplicate(ar)==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}
