//update bit operation
// Q.  update the 2 nd bit(position = 1) of a no n to 1. (n = 0101)
// for 1 ------> bit mask= 1 << i; operation : AND with NOT -------> ekhane 1 ache tai etake 0 banate hobe tar mane eta hoche clear operation
// for 0 ------> bit mask= 1 << i; operation : OR -------> ekhane 0 ache tai etake 1 banate hobe tar mane eta hoche set operation

import java.util.Scanner;

public class updateBit_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt(); // int operation = 1 set //update bit to 1 // update bit to 0 , operation = 0// -----> clear
        int n = 5;
        int position = 1;

        int bitMask = 1 << position;

        if (operation == 1) {
            // set operation
            int newNumber = bitMask | n;

            System.out.println(newNumber);
        } else {
            //clear operation
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

        sc.close();
    }
}
