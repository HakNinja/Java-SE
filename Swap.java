import java.util.Scanner;
class Swap{
public static void main(String [] args){
    int i,j,temp;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter first number: ");
    i=input.nextInt();
    System.out.print("Enter second number: ");
    j=input.nextInt();
    System.out.println("Before swapping :\n first number = "+i+" and second number="+j);
    temp=i;
    i=j;
    j=temp;
    System.out.println("After swapping :\n first number = "+i+" and second number="+j);
    }   
}