public class getBit_2 {
    public static void main(String[] args) {
        int n = 5; //0101
        int position = 3; //0111

        int bitMask = 1 << position;

        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }

}
