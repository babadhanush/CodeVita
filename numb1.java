class numb1{
public static void main(String a[]){
int n=4,t=1;;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(i>=j)
System.out.print(" "+t+" ");
else
System.out.print("   ");
t++;
}
t-=2;
for(int j=1;j<n;j++){
if(i+j>=n-1)
System.out.print(" "+t+" ");
else
System.out.print("   ");
t--;
}
t=1;
System.out.println("");
}
for(int i=1;i<n;i++){
for(int j=0;j<n;j++){
if(i+j<=n-1)
System.out.print(" "+t+" ");
else
System.out.print("   ");
t++;
}t-=2;
for(int j=1;j<n;j++){
if(i<=j)
//System.out.print("   ");
System.out.print(" "+t+" ");
else
System.out.print("   ");
t--;
}t=1;
System.out.println("");
}
}
}