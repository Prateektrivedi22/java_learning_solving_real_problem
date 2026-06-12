
/*class employee{
int salary;
String name;

public int getSalary(){
    return salary;

}
public String getName(){
    return name; 
}
public void setName(String n){
    name = n;
}


}

class cellphone{
    public void ring (){
        System.out.println("ringing...");
    }
      public void vibrate(){
         System.out.println("vibrate...");

}
public void callfriend (){
        System.out.println("callfriend...");
}
 */
class Square {
    float  side ;
    public float  area(){
    return side * side ;
     }
   public  float perimeter(){
    return 4*side;
   }

    

} 




public class cwh_39_chapter8practiceset {
    public static void main(String[] args ){
     /* 
        // problem 1 
        employee harry = new employee();
        harry.salary = 233;

        harry.setName("codewithharry");
        System.out.println(harry.getName());
         System.out.println(harry.getSalary());

// problem 2 

cellphone asus = new cellphone();
asus.callfriend();
asus.vibrate();
asus.ring();
*/

// create a class square with a method to initialize its side , calculating area , perimeter etc

Square sq = new Square();
sq.side = 3;
System.out.println(sq.area());
System.out.println(sq.perimeter());

    }


    
}
