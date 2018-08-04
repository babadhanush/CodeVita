import java.util.*;
class equi
{
   public static void main(String arg[])
   {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(),arr[]=new int[n],i=0,j=n-1;
      for(int k=0;k<n;k++)
         arr[i]=s.nextInt();
      int s1=arr[i],s2=0,s3=arr[j],a=0,b=0;
      while(i<j)
      {
         if(s1>s3)
         {
            j--;
            s3+=arr[j];
         }
         else if(s1<s3)
         {
            i++;
            s1+=arr[i];
         }
         else
         {
            a=i+1;
            b=j-1;
            for(int k=a+1;k<b;k++)
                  s2+=arr[k];
            if(s2==s1)
            {
                  System.out.println("the equi pairs are ("+a+","+b+")");
                  break;
            }
            else
            {
                  System.out.println("no equi pairs");
                  break;
            }
         }
      }
   }
}