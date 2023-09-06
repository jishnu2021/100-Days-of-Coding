public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
    
        while (i >= 0 || j >= 0) {
            int bitA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
            int bitB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;
            int sum = bitA + bitB + carry;
            carry = sum / 2;
            result.insert(0, sum % 2);
            i--;
            j--;
        }
    
        if (carry > 0) {
            result.insert(0, carry);
        }
    
        return result.toString();
    }
    public static void main(String[] args) {
        AddBinary adder = new AddBinary(); // Create an instance of the AddBinary class
        String s = "11";
        String s1 = "10";
    
        String ans = adder.addBinary(s, s1); // Call the method on the instance
    
        System.out.println(ans);

    }
}
