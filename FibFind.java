import java.util.*;
class FibFind{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int k=sc.nextInt(),in=0, ans[]=new int[k];
for(int i=0;i<k;i++){
int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt();
if(n==0) in=a;
else if(n==1) in=b;
else if(n>1){
int arr[]=new int[n];
arr[0]=a;
arr[1]=b;
for(int j=2;j<n;j++)
arr[j]=arr[j-1]+arr[j-2];
in=arr[n-1];
}
ans[i]=in;
in=0;
}
for(int s=0;s<k;s++)
System.out.println(ans[s]);
}}
