public class Leet58 
{
    public static int length(String s)
    {
        int length=0;
        int i=s.length()-1;

        while(i>=0 && s.charAt(i)==' ')
        {
            i--;
        }
        while(i>=0 && s.charAt(i)!=' ')
        {
            length++;
            i--;
        }
        return length;
    }
    public static void main (String[] args)
    {
        String s= "Hello World";
        int result=length(s);
        System.out.println(result);

        System.out.println(s.length());

}
}