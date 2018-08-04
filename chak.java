import java.util.*;
class chak{
public static void main(String a[]){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt(),i,j,j1=0,c=n-1,r=n-1,i1=0,t=1,arr[][]=new int[n][n];
for(i=0;i<n;i++){
for(j=0;j<n;j++){
arr[i][j]=t;
t++;
}}
for(i=0;i<n;i++){
for(j=0;j<n;j++)
System.out.print(arr[i][j]+" ");
System.out.println("");
}
System.out.println("-----------");
System.out.println("-----------");
while(i1<=r&&j1<=c)
{
for(j=j1;j<=c;j++)
System.out.print(arr[i1][j]+" ");
i1++;
//System.out.println("");
for(i=i1;i<=r;i++)
System.out.print(arr[i][c]+" ");
c--;
//System.out.println("");
for(j=c;j>=j1;j--)
System.out.print(arr[r][j]+" ");
r--;
//System.out.println("");
for(i=r;i>=i1;i--)
System.out.print(arr[i][j1]+" ");
j1++;
//System.out.println("");
}}}