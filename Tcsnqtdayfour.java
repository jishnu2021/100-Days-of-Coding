public class Tcsnqtdayfour {
    public static void main(String[] args) {
        String s = "###***#*#";
        countValue(s);
    }
    public static void countValue(String s){
        int counthash = 0;
        int countstar = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                counthash++;
            }else if(s.charAt(i) == '*'){
                countstar++;
            }
        }

        if(counthash == countstar){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
