
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return super.toString() + "Radius cannot be negative";
    } 
    @Override
    public String getMessage(){
        return super.getMessage() + "Radius cannot be negative";
    }
}

public class cwh_84_throwvsthrows {
public static double area (int radius )throws NegativeRadiusException{
    if (radius<0){
        throw new NegativeRadiusException();
    } 
    
    double area = 3.14*radius*radius;
     return area ;
} 
    public static int divide (int a , int b )throws ArithmeticException{
        int result = a/b;
        return result ;
    }
    public static void main(String[] args){
        try{
// int c = divide(6,0);
//     System.out.println(c);

double ar = area(-6);
System.out.println(ar);

        }
        catch(Exception e){
            System.out.println("exception" + e);
        }
    }
    
}
