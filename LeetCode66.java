public class LeetCode66 
{
    public static int[] plus(int[] digits)
    {
        for (int i=digits.length-1; i>=0;i--)
        {
            digits[i]++;
            if(digits[i]==10)
            {
                digits[i]=0;
            }else{
               
                return digits;
            }
        }
        int[] newDigits= new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }
    public static void main (String[] args)
    {
        int[] digits={1,2,3};
        int[] result= plus(digits);
        System.out.println("Incremented Large Integer: ");
        for(int i=0; i<result.length;i++)
        {
            System.out.print(result[i]);
        }

}
}