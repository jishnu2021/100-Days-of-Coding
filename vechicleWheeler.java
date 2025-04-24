public class vechicleWheeler {
    public static void main(String[] args) {
        int v = 200;
        int w = 540;
        findWheeler(v,w);
        
    }

    public static void findWheeler(int v, int w){
        int y = (w-2*v)/2;
        int x = (v-y);

        System.out.println("Two Wheelers are: " + x);
        System.out.println("Four Wheelers are : " + y);

    }
}
