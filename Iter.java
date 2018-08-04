import java.util.*;
class Iter{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),c=1;
int[] a1=new int[n];
int[] a2=new int[60];
for(int i=0;i<n;i++)
a1[i]=s.nextInt();
int k=s.nextInt();
for(int i=0;i<n;i++){
System.out.print(a1[i]+" ");
if(i>0&&a1[i]==1&&a1[i-1]==1)
c++;
else
c=1;
if(c==k){
System.out.print("0 ");
c=0;
}}
}
}