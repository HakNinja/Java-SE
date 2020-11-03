abstract class Ab{
    abstract public void display();
}
public class AbClass extends Ab{
    public void display(){
        System.out.println(" Hello, Everyone");
    }
public static void main(String [] args){
    AbClass obj=new AbClass();
    obj.display();
    }   
}
