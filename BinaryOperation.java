public class BinaryOperation {
    public static void main(String[] args) {
        String a = "Jishnu";
        String b = "Ghosh";

        System.out.println("Not operation :"+FindNOT(a));
        System.out.println("OR operation :"+FindOR(a,b));
        System.out.println("AND operation :"+FindAND(a,b));
        System.out.println("XOR operation :"+FindXOR(a,b));
    }

    public static String FindAND(String a, String b){
        char[] arr = a.toCharArray();
        char[] num = b.toCharArray();

        StringBuilder res = new StringBuilder();

        int len = Math.min(arr.length, num.length);
        for(int i=0;i<len;i++){
            res.append((arr[i]=='1' && num[i] == '1')? "1" : "0");
        }
        return res.toString();
    }

    public static String FindNOT(String a){
        char[] arr = a.toCharArray();
        StringBuilder res = new StringBuilder();

        
        for (char c : arr) {
            res.append(c == '1' ? "0" : "1");
        }
        return res.toString();
    }
    public static String FindOR(String a, String b){
        char[] arr = a.toCharArray();
        char[] num = b.toCharArray();

        StringBuilder res = new StringBuilder();

        int len = Math.min(arr.length, num.length);
        for(int i=0;i<len;i++){
            res.append((arr[i]=='1'|| num[i] == '1')? "1" : "0");
        }
        return res.toString();
    }
    public static String FindXOR(String a, String b){
        char[] arr = a.toCharArray();
        char[] num = b.toCharArray();

        StringBuilder res = new StringBuilder();

        int len = Math.min(arr.length, num.length);
        for(int i=0;i<len;i++){
            res.append((arr[i]!=num[i])? "1" : "0");
        }
        return res.toString();
    }
}
