package mypack;
class Cls{
    private String st;      //private
    void getdata(String s){     //default
        st=s;
    }
    protected String display(){     //protected
        return st; 
    } 
}
class SubCls extends Cls{
    public void displayCls(){       //public
        System.out.println(display());
    }   
}