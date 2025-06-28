// clear bit operation
//Q. clear the 3rd bit (position = 2) of a number n . (n = 0101)
//bit mask : 1 << i
//operation : AND with NOT  ----> 1st e not then and operation hobe
public class clearBit_1 {
    public static void main(String[] args) {
        int n = 5; //0101 ----> original no
        int position = 2;

        int bitMask = 1 << position;

        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;

        System.out.println(newNumber);


    }
}
