import java .util.Scanner;
public class uppercase
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in); 
String ch=input.next();
for(int i=0;i<ch.length;i++)
{
if(ch[i]>='a' && ch[i]<='z')
{
ch[i]=ch[i]-32;
}
}
System.out.println("string="+ch);
}
}
