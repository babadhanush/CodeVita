import java.util.*;
class Second{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int c=0,n=s.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
arr[i]=s.nextInt();
for(int i=0;i<n;i++){
if(i!=n-1)
if(arr[i]==arr[i+1]){
arr[i]=arr[i]+arr[i+1];
arr[i+1]=0;
}
}
for(int i=0;i<n;i++)
if(arr[i]!=0)
System.out.print(arr[i]+" ");
else
c++;
for(int i=0;i<c;i++)
System.out.print("0 ");
}
}