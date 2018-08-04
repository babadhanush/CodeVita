import java.util.*;
class PalinSorting{
public static int co=0;
public static String arr[]=new String[6000];
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
String str=s.next();
int n=str.length(),i=0,j=n-1;
char[] ch=str.toCharArray();
permute(ch,i,j);
Arrays.sort(arr,0,co);
for(int k=0;k>arr.length;k++){
if(arr[k].equals(new StringBuilder().append(arr[k]).reverse().toString())){
System.out.println(arr[k]);
}}
}
static void permute(char[] ch,int i,int j){
char t;
if(i==j){
arr[co]=String.valueOf(ch);
co++;
//System.out.println("");
}else{
for(int k=i;k<=j;k++){
t=ch[i];
ch[i]=ch[k];
ch[k]=t;
permute(ch,i+1,j);
t=ch[i];
ch[i]=ch[k];
ch[k]=t;
}}
//System.out.println(co);
}}