import java.util.*;
class arr{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
char t;
int l=0,r=str.length()-1;
char[] ch=str.toCharArray();
while(l<r){
if(!Character.isAlphabetic(ch[l]))
l++;
else if (!Character.isAlphabetic(ch[r]))
r--;
else{
t=ch[l];
ch[l]=ch[r];
ch[r]=t;
l++;
r--;
}
}
str=str.valueOf(ch);
System.out.print(str);
}}