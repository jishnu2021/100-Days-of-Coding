public class ClearBit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;

        int not= ~(bitMask);

        int newnum = n & not;
        System.out.println(newnum);
    }
}
