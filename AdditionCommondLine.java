public class AdditionCommondLine
{
public static void main(String [] args)
{
if (args.length>0)
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
System.out.println("sum"+(a+b+c));
}
}
}
