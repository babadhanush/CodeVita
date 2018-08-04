import java.util.*;
class CheckStrAnagram{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String str[]=new String[n];
for(int i=0;i<n;i++)
str[i]=sc.next();
int i=0;
while(i<n-1){
for(int j=i+1;j<n;j++){
char[] s1=str[i].toCharArray(),s2=str[j].toCharArray();
if(s1.length==s2.length){
Arrays.sort(s1);
Arrays.sort(s2);
if(String.valueOf(s1).equals(String.valueOf(s2)))
System.out.println(str[i]+"---"+str[j]);i++;
}}
i++;
}}}