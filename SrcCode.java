import java.io.*;
class SrcCode{
public static void main(String arg[]){
//Scanner sc=new Scanner(System.in);
System.out.println("The Source Code is\n--------------------");
try{
BufferedReader br = new BufferedReader(new FileReader("SrcCode.java"));
String l=null;
while((l=br.readLine())!=null)
System.out.println(l);
br.close();}
catch(Exception e){
System.out.println("file not found");
}
}}