// public class recq {
//  public static void main(String[] args) {
//     pname(5);
//  }
 
//  static void pname(int n){
    
//     if(n==0){
//         return;
//     }
//     System.out.println("Jishnu");
//     pname(n-1);

//  }
// }

/**
 * recq
 */
// public class recq {

//     public static void main(String[] args) {
//         numr(1);
//     }
//     static void numr(int n){
//         if(n<=5){
//             System.out.println(n);
//             numr(n+1);
//         }
//     }
// }

/**
 * recq
 */
// public class recq {

//     public static void main(String[] args) {
//         System.out.println(fact(5));
//     }

//     static int fact(int n){
//         if(n==1){
//             return 1;
//         }
//         return n*fact(n-1);
//     }
// }

/**
 * recq
 */
// public class recq {

//     public static void main(String[] args) {
//         System.out.println(snum(5));
//     }

//     static int snum(int n){
//         if(n==1){
//             return 1;
//         }

//         return n+snum(n-1);
//     }
// }

/**
 * recq
 */
// public class recq {

//     public static void main(String[] args) {
//         int ans = digitrec(1345);
//         System.out.println(ans);
//     }

//     static int digitrec(int n){

//         if(n==0){
//             return 0;
//         }
        
//            int r = n%10;
//            int  b=n/10;
        

//         return r+digitrec(b); 
//     }
// }



/**
 * recq
 */
//concept 
// public class recq {
//     public static void main(String[] args) {
//         pname(5);
//     }
//     static void pname(int n){   
//             if(n==0){
//                 return;
//              }
//              System.out.println("Jishnu");
//          // Infinite loop
//          //    pname(n--);
//          pname(n--);       
//       }
// }


/**
 * recq
 */
// public class recq {

//     public static void main(String[] args) {
//         System.out.println(rev(1829,0));
//     }
//     static int rev(int n,int s){
//         if (n>0) {
//             int r=n%10;
//             s=s*10 + r;
//             n=n/10;
//             return  rev(n, s);
//         }
//         return s;
       
//     }
// }

// second Method of reversing a number

/**
 * recq
 */
// public class recq {

//     public static void main(String[] args) {
//         System.out.println(rev2(12345));
//     }
//     static int rev2(int n){
//         int digit=(int)(Math.log10(n))+1;
//         return helper(n,digit);
//     }
//     private static int helper(int n, int digit) {
//         if(n%10==n){
//             return n;
//         }

//         int rem=n%10;
//         return rem * (int)(Math.pow(10, digit-1))+helper(n/10, digit-1);
//     }
   
// }

/**
 * recq
 */
/**
 * recq
 */


// public class recq {

//     public static void main(String[] args) {
//         int n=123291;
//        int t= palin(n, 0);
//         System.out.println(t);
//        if(n==t){
//         System.out.println("palin");
//        }else{
//         System.out.println("not");
//        }
//     }
    
//     private static int palin(int n,int s) {
//         if(n>0){
//             int r=n%10;
//              s=s*10 + r;
//              n=n/10;
//             return palin(n, s);
//         }

//         return s;
//     }
// }


/**
 * recq
 */
// public class recq {

//     public static void main(String[] args) {
//         int t = countzero(1000020300,0);
//         System.out.println(t);
//         }

//     private static int countzero(int n,int c) {

//         if (n>0) {
//             int rem=n%10;
//             n=n/10;
//             if(rem==0){
//                 c++;
//               return countzero(n, c);
//             }else{
//                 return countzero(n, c);
//             }
//         }
//         return c;

//     }
// }

/**
 * recq
 */
/**
 * recq
 */
public class recq {

    public static void main(String[] args) {
        int step=stepcount(123);
        System.out.println(step);
    }

    static int s=0;
   public static int stepcount(int n){
        if(n==0){
            return s;
        }
        if(n%2==0){
            s++;
            n=n/2;
            return stepcount(n);
        }else{
            s++;
            n=n-1;
            return stepcount(n);
        }
        
    }
}