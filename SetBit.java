public class SetBit {
    public static void main(String[] args) {
        int n=5;
        int pos=3;
        int bitMask=1<<pos;

        int newnum=bitMask | n;
        System.out.println(newnum);
    }   
}
