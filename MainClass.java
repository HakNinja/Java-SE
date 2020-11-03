//defining class
class MyClass{
private int x;
public void getdata(int i){
    x=i;
} 
public void display(){
    System.out.println("Value of x = "+x);
}
}
public class MainClass{
public static void main(String[] args){
MyClass obj=new MyClass(); //object
obj.getdata(10);
obj.display();
}
}
