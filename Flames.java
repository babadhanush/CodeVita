import java.util.*;
class Flames{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
String st1=s.next(),st2=s.next();
char s1[]=st1.toCharArray(),s2[]=st2.toCharArray();
int c1=0,co=0;
for(int i=0;i<s1.length;i++){
for(int j=0;j<s2.length;j++){
if(s1[i]==s2[j]){
c1++;
s2[j]=' ';
break;
}}}
int f=(st1.length()+st2.length())-(2*c1);
String ch="flames";
StringBuilder str=new StringBuilder(ch);
System.out.println(f);
char ans=0;
String t;
while(str.length()!=1){
int n=f%str.length();
if(n!=0)
t=str.substring(n)+str.substring(0,n-1);
else
t=str.substring(0,str.length()-1);
str=new StringBuilder(t);
ans=str.charAt(0);
}
switch(ans){
case 'f':
System.out.println("Friends");
break;
case 'l':
System.out.println("Lovers");
break;
case 'a':
System.out.println("Affectionate");
break;
case 'm':
System.out.println("Married");
break;
case 'e':
System.out.println("Enemies");
break;
case 's':
System.out.println("Siblings");
break;
}
}}