public class CommandlineArgs{
public static void main(String [] args){
if (args.length==2){
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    System.out.println("Sum of "+args[0]+" and "+args[1]+" is "+(a+b));
        }
else{
    System.out.println(" Invalid input");
        }
    }
}
