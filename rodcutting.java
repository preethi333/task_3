/** rod cutting program
  * @author preethi
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
  
class Rodcutting {
       public static int specialrodcount(int n){
          int count=0;
          while(n>0){
              n--;
              n=n/2;
              count++;
          }          
          return count;
       }
    public static void main(String args[] ) throws Exception {
       
 
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            System.out.println(specialrodcount(n)-1);
        }
      
    }
}