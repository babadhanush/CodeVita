import java.util.*;
class Number{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
//Integer IN=new Integer(0);
int n=sc.nextInt(),a[]=new int[n];
String ans="";
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int in=0,m=a[0],k=sc.nextInt(),l=ans.length();
int fd[]=new int[n];
for(int i=0;i<n;i++)
fd[i]=Integer.parseInt(Integer.toString(a[i]).substring(0,1));
while(l<=k){
for(int i=0;i<n;i++){
//System.out.print(fd[i]+" ");
if(fd[i]>m&&a[i]>=a[in]){
m=fd[i]; in=i;
}
}
l=ans.length();
if(l<=k){
ans=ans+Integer.toString(a[in]);
a[in]=0;}
}
System.out.println(ans);
}}