import java.util.Scanner;
public class Swap{
public static void main(String [] args){
Scanner i=new Scanner(System.in);
int x,y,z;
System.out.println("Enter two value");
x=i.nextInt();
y=i.nextInt();
System.out.println("before swap:\n x= "+x+" y="+y);
z=x;
x=y;
y=z;
System.out.println("After swap:\n x="+x+" y="+y);
}
}
