
class Base{
    protected int data;
}
class Child extends Base{
    public void getdata(int input){
        data=input;
    }
    public void display(){
        System.out.println("Data in agrument : "+data);
    }
}
public class SingleInhertance{
public static void main(String [] args){
    Child obj=new Child();
    obj.getdata(10);
    obj.display();
    }   
}
