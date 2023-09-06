public class addxinend {
    public static void moveAllx(String s,int indx,int count,String newString){
        if(indx==s.length()){
            for(int i=0;i<count;i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }

        char cuurent=s.charAt(indx);
        if(cuurent=='x'){
            count++;
            moveAllx(s, indx+1, count, newString);
        }else{
            newString +=cuurent;
            moveAllx(s, indx+1, count, newString);
        }
    }
    public static void main(String[] args) {
     String s="abxsxxbsaxxd"  ;
     moveAllx(s, 0, 0, ""); 
    }
}
