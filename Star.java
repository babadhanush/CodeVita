//import java.util.*;
class Star{
public static void main(String arg[]){
//Scanner s=new Scanner(System.in);
int n=4;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)
if(i+j>=n-1)
System.out.print(" * ");
else
System.out.print("   ");
for(int j=1;j<n;j++)
if(i>=j)
System.out.print(" * ");
else
System.out.print("   ");
System.out.println("");
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)
if(i>=j)
System.out.print(" * ");
else
System.out.print("   ");
for(int j=1;j<n;j++)
if(i+j>=n-1)
System.out.print(" * ");
else
System.out.print("   ");
System.out.println("");
}
for(int i=1;i<n;i++){
for(int j=0;j<n;j++)
if(i+j<=n-1)
System.out.print(" * ");
else
System.out.print("   ");
for(int j=1;j<n;j++)
if(i<=j)
System.out.print(" * ");
else
System.out.print("   ");
System.out.println("");
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)
if(i<=j)
System.out.print(" * ");
else
System.out.print("   ");
for(int j=1;j<n;j++)
if(i+j<=n-1)
System.out.print(" * ");
else
System.out.print("   ");
System.out.println("");
}
}
}