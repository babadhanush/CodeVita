import java.util.*;
public class Possiblities {
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int n=s.length();
char[] arr=s.toCharArray();
int a=scan.nextInt();
int b=scan.nextInt();
if(b<a){
int temp=a;
a=b;
b=temp;
}
int p=(int)Math.pow(2,n);
int k=0;
StringBuffer str[]=new StringBuffer[p];
String st[]=new String[p];
for(int i=1;i<p;i++){
int ta[]=d2b(i,n);
int count=0;
for(int j=0;j<n;j++)
if(ta[j]==1)
count++;
if(a<=count && count<=b){
for(int j=0;j<n;j++)
if(ta[j]==1)
if(str[k]!=null)
str[k].append(String.valueOf(arr[j]));
else{
String s1=String.valueOf(arr[j]);
str[k]=new StringBuffer(s1);
}
st[k]=str[k].toString();
k++;
}
}
for(int i=0;i<k;i++)
for(int j=i+1;j<k;j++)
if(st[i].length()>st[j].length()){
String temp=st[i];
st[i]=st[j];
st[j]=temp;
}
for(int i=0;i<k;i++) 
for(int j=i+1;j<k;j++) 
if(st[i].compareTo(st[j])>0&&!(st[i].length()<st[j].length())){
String temp=st[i];
st[i]=st[j];
st[j]=temp;
}
for(int i=0;i<k;i++)
System.out.println(st[i]);
}
private static int[] d2b(int i,int size){
int a[]=new int[size];
for(int j=size-1;i>0;j--){
a[j]=i%2;
i=i/2;
}
return a;
}
}