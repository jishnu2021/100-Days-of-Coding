public class BinaryStringOp {
    public static void main(String[] args) {
        String expression = "1 AND 0 XOR 0 OR 1 AND 0 XOR 1";
        int result = eval(expression);
        System.out.println("Result " + result);
    }
    public static int eval(String a){
        String[] num = a.split(" ");

        int res = Integer.parseInt(num[0]);

        for (int i = 1; i < num.length; i += 2){
            String operator = num[i];
            int nextval = Integer.parseInt(num[i+1]);


            if (operator.equals("AND")) {
                res = res & nextval;
            } else if (operator.equals("XOR")) {
                res = res ^ nextval;
            } else if (operator.equals("OR")) {
                res = res | nextval;
            } else {
                throw new IllegalArgumentException("Wrong operator " + operator);
            }
        }
        return res;
    }
}
