import java.util.*;
class IntExp{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),num;
String ans;
while(n>0){
num=sc.nextInt();
ans="";
while(num>0){
if(num>=111){
num=num-111;
ans=ans+"+111";
}
else if(num>=11){
num=num-11;
ans=ans+"+11";
}
else{
num=num-1;
ans=ans+"+1";
}
}n--;
System.out.println(ans.length()-1);
}}}