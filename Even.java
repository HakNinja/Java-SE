import java.util.Scanner;
class Even{
public static void main(String []args){
    System.out.print("Enter any number: ");
    Scanner i=new Scanner(System.in);
    int n=i.nextInt();
    if(n%2==0)
        System.out.println("Entered number is a even.");
    else
        System.out.println("Entered number is not a even.");
    } 
}
