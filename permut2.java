import java.util.*;
class permut2{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
String str=s.next();
int n=str.length(),l=n-1,sum=0,p=0,j=0;
char[] t=str.toCharArray(),ch=str.toCharArray();
Arrays.sort(t);
while(j<l){
for(int i=0;i<n;i++)
if(t[i]==ch[j]){
t[i]='\0';
break;
}
else {
if(t[i]!='\0') p++;}
sum=sum+(f(l)*p);
l--;
j++;
}
System.out.println(sum+1);
}
static int f(int n)
{
return (n <= 1)? 1 :n * f(n-1);
}
}