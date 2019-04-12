/** descendingweights program
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class Descendingweights
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner (System.in);
       int n=s.nextInt();
       int k=s.nextInt();
      ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
      for(int i=0;i<n;i++){
          ArrayList<Integer> a=new ArrayList<Integer>();
          al.add(a);
      }
      for(int i=0;i<n;i++){
          int b=s.nextInt();
          al.get(b%k).add(b);
      }
      for(int i=k-1;i>=0;i--){
          Collections.sort(al.get(i));
          for(int j=0;j<al.get(i).size();j++){
                System.out.print(al.get(i).get(j)+" ");   
            }
        }
  }
}
