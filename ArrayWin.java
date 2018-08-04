import java.util.*;
class ArrayWin{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),a[]=new int[n],k;
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
k=sc.nextInt();
int i=0;
while(i+2<n){
if(a[i+2]==n-1)
System.out.print("");
else 
System.out.print(a[i+2]>(a[i]>a[i+1]?a[i]:a[i+1])?a[i+2]:((a[i]>a[i+1])?a[i]:a[i+1]));
i++;
}}}
