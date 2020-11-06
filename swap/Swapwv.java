public class Swapwv{
public static void main(String [] args){
int x=12,y=14;
System.out.println("before swap:\n x= "+x+" y="+y);
x=x^y;
y=x^y;
x=x^y;
System.out.println("After swap:\n x="+x+" y="+y);
}
}
