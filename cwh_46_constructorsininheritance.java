class base1{

   public  base1(){
   
    System.out.println( "i am a constructor ");

    }
 
public  base1( int x ){
   
    System.out.println( "i am an overloaded  constructor with the value of x as :  " + x);

    }


}

class derived1 extends base1 {
    public int y;

    public derived1 (){
        // super(0);
        System.out.println("i am a derived class constructor  ");
    }
    public derived1 (int x , int y ){
        // super(x);
        System.out.println(" i am an overloaded constructor of derived class with the value of   and  y as : " +y );

    }


}
class childofderived extends derived1{
    childofderived(){
        System.out.println(" i am a child of derived constructor  ");

    }

      childofderived(int x , int y , int z ){
        super(x,y);
        System.out.println(" i am an child of  overloaded derived constructor with the value of z as :  " +z);
        
    }

}


public class cwh_46_constructorsininheritance {
    public  static void main(String[] args){
// base1 b  = new base1(4 );
//derived1 d = new derived1( 56 , 67 );
// childofderived cd = new childofderived();
childofderived cd = new childofderived(12, 13 , 14);



    }
    
}
