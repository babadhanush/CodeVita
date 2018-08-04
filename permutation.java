import java.util.*;
class permutation{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
String str=s.next();
int co=0,n=str.length(),i=0,j=n-1;
char[] ch=str.toCharArray();
permute(ch,i,j,co);
}
static void permute(char[] ch,int i,int j,int co){
char t;
//int co;
if(i==j){
for(int y=0;y<ch.length;y++)
System.out.print(ch[y]);
co++;
System.out.println("");
}else{
for(int k=i;k<=j;k++){
t=ch[i];
ch[i]=ch[k];
ch[k]=t;
permute(ch,i+1,j,co);
t=ch[i];
ch[i]=ch[k];
ch[k]=t;
}}
//System.out.println(co);
}}