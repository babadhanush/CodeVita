import java.util.*;
class ASCII{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("1: all, 2: for a string ,3: toupper/tolower");
int ch=sc.nextInt();
switch(ch){
case 1:
for(int i=0;i<=255;i++)
System.out.println("ASCII value for "+(char)i+" is "+i);
break;
case 2:
String str=sc.next();
char c[]=str.toCharArray();
for(int k=0;k<c.length;k++)
System.out.println("ASCII value for "+c[k]+" is "+(int)c[k]+" ");
break;
case 3:
String str1=sc.next();
char c1[]=str1.toCharArray();
for(int k=0;k<c1.length;k++)
//char c1=sc.next().charAt(0);
if(!Character.isUpperCase(c1[k])) System.out.println("Upper case ASCII is "+(int)Character.toUpperCase(c1[k]));
else System.out.println("Lower case ASCII is "+(int)Character.toLowerCase(c1[k]));
break;
default: System.out.println("Invalid");
break;
}
}}