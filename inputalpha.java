import java .util.Scanner;
public class inputalpha
{
public static void main(String[] args)
{
System.out.println("enter any char:");
Scanner input=new Scanner(System.in); 
char ch=input.next().charAt(0);
if(ch>=48 && ch<=58)
System.out.println("invalid char");
}
}
