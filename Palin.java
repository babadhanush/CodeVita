import java.util.*;
class Palin{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),x,s=n,m=n,a,c=0,ans=0;
while(c<5){
a=0;
while(m>0){
x=m%10;
a=a*10+x;
m=m/10;
}
if(a==s){
ans=s;
c=5;
}
else
{
s=s+a;
c++;
}
m=s;
}
if(ans!=0)
System.out.println(ans);
else
System.out.println("No Palindrome");
}}