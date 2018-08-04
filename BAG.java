import java.util.*;
import java.lang.*;
class BAG{
public static void main(String arg[]){
Scanner scan=new Scanner(System.in);
int t=scan.nextInt(),n=(int)Math.sqrt(t)-1;
int a[]=new int[n];
for(int i=0;t!=0;i++){
a[i]=(t+1)/2;
t-=a[i];
if(a[i]==1)
break;
}
for(int i=1;i<=n;i++)
if(a[i-1]!=0)
System.out.println("Bag "+i+" contains "+a[i-1]);
int s=scan.nextInt();
for(int i=0;s!=0;i++)
if(s>=a[i]){
s=s-a[i];
System.out.println("Bag "+(i+1)+" : "+a[i]+" ");
}
}}