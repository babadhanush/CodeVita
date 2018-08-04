import java.util.*;
class Nthperm{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int n=s.length()-1;
int r=sc.nextInt();
System.out.println("in rank "+k+": "+findrank(s,r));
}
static String findrank(String s,int k){
int r=1;
for(int i=0;i<n;i++){
int co=0;
for (int j=i+1;j<=n;j++)
{
if (s.charAt(i)>s.charAt(j))
co++;
}
r+=co*f(n-i);
}
}
static int f(int n){ return (n <= 2) ? n : n * f(n - 1); }
}