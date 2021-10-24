public class RecursionIntro
{
   public static int rec1(int x){
       if(x <= 0){
           return 2;
       } else {
           return rec1(x-1)+4;
       }
   }
   public static String rec2(String a){
       if(a.length() <= 1){
           return a.substring(0,1);
       } else {
            return rec2(a.substring(0,a.length()-1))+a+"z";
       }
   }
   public static int fibonacci(int n){
       if(n == 0 || n == 1){
           return 1;
       } else {
           return fibonacci(n-1) + fibonacci(n-2);
       }
   }
   public static int arithmetic(int n, int startTerm, int diff){
       if(n <= 0){
           return startTerm;
       } else {
           return arithmetic(n-1, startTerm, diff) + diff;
       }
   }
}
