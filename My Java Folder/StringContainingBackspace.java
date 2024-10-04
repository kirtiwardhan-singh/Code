public class StringContainingBackspace 
{
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("xy#z");
        int l = 0;
        int r = 0;
        
        while (r < sb1.length()) {
            if (sb1.charAt(r) != '#') {
                l++;
                r++;
            } else {
                if (l > 0) { // Ensure there are characters to delete
                    l--;
                }
                r++;
                sb1.deleteCharAt(r - 1); // Delete the backspace character
                if (l >= 0) { // Check if there are characters to delete
                    sb1.deleteCharAt(l); // Delete the character before backspace
                }
            }
        }
        
        System.out.println(sb1.toString()); // Output: "xz"
        
        StringBuilder sb2 = new StringBuilder("xy#z");
         l = 0;
         r = 0;
        
        while (r < sb2.length()) {
            if (sb2.charAt(r) != '#') {
                l++;
                r++;
            } else {
                if (l > 0) { // Ensure there are characters to delete
                    l--;
                }
                r++;
                sb2.deleteCharAt(r - 1); // Delete the backspace character
                if (l >= 0) { // Check if there are characters to delete
                    sb2.deleteCharAt(l); // Delete the character before backspace
                }
            }
        }
        
        System.out.println(sb2.toString()); // Output: "xz"
        if(sb1.toString().compareTo(sb2.toString()))
        System.out.println("False");
        else
        System.out.println("True");
        

    }
}
