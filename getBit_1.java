//Get Bit operation
// Q. get the 3rd bit (position = 2) of a number n. (n = 0101)->[5]
//Bit Mask: 1 << i          ;    operation : AND
public class getBit_1 {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;

        int bitMask = 1 << position;

        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}