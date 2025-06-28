// Set bit operation
// set the 2 nd bit(position = 1) of a no n(n = 0101)
//bit mask : 1 << i
//operation : OR
public class setBit_1 {
    public static void main(String[] args) {
        int n = 5;
        int position = 1;

        int bitMask = 1 << position;

        int newNumber = bitMask | n;

        System.out.println(newNumber);

    }
}
