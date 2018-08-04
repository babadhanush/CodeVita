import java.util.*;
class FibFind{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
for(int i=0;i<k;i++){
int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt();
int arr[]= new int[n],in=0;
if(n==0) in=a;
else if(n==1) in=b;
else if(n>1){
arr[0]=a;
arr[1]=b;
for(int j=2;j<n;j++)
arr[j]=arr[j-1]+arr[j-2];
in=arr[n-1];
}
for(int s=0;s<n;s++)
System.out.print(" "+arr[s]);
}
}}