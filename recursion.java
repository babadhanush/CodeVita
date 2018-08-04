import java.util.*;
class recursion{
public static void main(String a[]){
String str;
Scanner s=new Scanner(System.in);
str=s.nextLine();
String r=s.next();
String arr[]=str.split(" ");
for(int i=(arr.length-1);i>=0;i--){
if(arr[i].compareTo(r)!=0)
System.out.print(arr[i]+" ");
else
System.out.print(new StringBuilder().append(arr[i]).reverse()+" ");
}
}
}