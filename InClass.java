interface Iface{
    public void display();
}
public class InClass implements Iface{
    public void display(){
        System.out.println(" Hello, Friends");
    }
public static void main(String [] args){
    InClass obj=new InClass();
    obj.display();
    }   
}
