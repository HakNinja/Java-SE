
class Base{
    protected int data1;
    protected int data2;
}
class Child extends Base{
    public void getdata(int input1 ,int input2){
        data1=input1;
        data2=input2;
    }
    public void display(){
        System.out.println("Data in agrument : "+data1+" and "+data2);
    }
}
class SubChild extends Child{
    public void sum(){
        System.out.println("Sum of "+data1+" and "+data2+" is "+(data1 + data2));
    }
}
public class MultilevelInhertance{
public static void main(String [] args){
    SubChild obj=new SubChild();
    obj.getdata(10,20);
    obj.display();
    obj.sum();
    }   
}
