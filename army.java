import java.util.*;
class Army {
    public static void main(String[]args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long min[]=new long[n+2];
        long max[]=new long[n+2];
        min[0]=s.nextLong();
        min[1]=s.nextLong();
        max[0]=min[0];
        max[1]=min[1];
        for(int i=2;i<n+2;i++)
        {
            long position=s.nextLong();
            long army=s.nextLong();
            if((min[0]<=position+army)&&(max[1]>=position-army)){
                min[i]=position-army;
                max[i]=position+army;
            }
            else if(min[0]<position+army){
                min[i]=min[1];
                max[i]=min[1];
            }
            else
            {
                min[i]=min[0];
                max[i]=min[0];
            }
        }
        Arrays.sort(min);
        Arrays.sort(max);
        long sum=0;
        for(int j=1;j<min.length;j++)
        {
            if(min[j]-max[j-1]>0)
                sum+=min[j]-max[j-1];
            
        }
          System.out.print(sum);
    }
}