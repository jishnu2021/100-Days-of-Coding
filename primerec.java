/**
 * primerec
 */
public class primerec {

  public static void main(String[] args) {
    int n=7;
    if(prec(n,2)){
      System.out.println("prime");
    }else{
      System.out.println("not prime");
    }


  }

  static boolean prec(int n , int i){
    if(n<=2){
      if(n==2){
        return true;
      }else{
        return false;
      }
    }
    if(n%i==0){
      return true;
    }
    if(i*i > n){
      return true;
    }

    return prec(n, i+1);
  }
}