import java.util.*;
class TOANAG{
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
System.out.println((st1.length()+st2.length())-(2*c1));
}}