class MethodOverloading{
public static int sum(int i,int j){
    return (i+j);
}
public static int sum(int i,int j,int k){
    return (i+j+k);
}
public static void main(String[] args){
System.out.println("Sum of 12 and 13 is "+sum(12,13));
System.out.println("Sum of 12 and 13 is "+sum(11,15,19));
}
}
