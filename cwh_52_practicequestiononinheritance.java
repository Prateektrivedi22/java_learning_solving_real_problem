
class circle {
    int radius ;
    public int  getradius(){
        return radius ;
       
    }
    public void setradius(int x ){
        this.radius = x ; 
    } 
    public double  area (){
        System.out.println("this is the area of circle" );
        return 3.14*radius*radius ;
    }
}
class cylinder extends circle  {
    int height;
public int  getheight(){
    return height ;
}
public void setheight(int y){
    this.height = y;
}

public double volume(){
    System.out.println("this is thwe volme of cylinder ");
    return 3.14*radius*radius*height;

}

}


class rectangle1{
    public int length;
    public int breadth ;
    rectangle1 (int l , int b ){
        this.length = l ;
        this.breadth  = b;
        System.out.println("this is the required constructor of rectangle class ");

    }

    public double area(){
        return length*breadth;
    }

    }

    class cuboid1 extends rectangle1 {
        public int height ;
       
        cuboid1 ( int l , int b , int h){
            
            super( l , b);
            this.height = h;
            System.out.println("i am an constructor of inherited class rectangle ");

        }
        public int volume() {
            return length*breadth*height;

        }

    }


public class cwh_52_practicequestiononinheritance {
    public static void main(String[] args) {
        // problem 1 :
        // create a class circle and use inheritance to create another class cylinder
        // from it .
cylinder C = new cylinder ();
circle c  = new circle (); 
// c.setradius(7);
C.setradius(5);
C.setheight(9);
C.volume();
c.area();

System.out.println(C.volume());

// System.out.println(c.getradius());
System.out.println(C.getradius());
System.out.println(C.getheight());


// create a class rectangle and use inheritance to create another class cuboid try to keep it as close to real world scenario as possible 
cuboid1 obj = new cuboid1(4 , 6 ,9);
rectangle1 obj1 = new rectangle1(4,6);

System.out.println(obj.volume());
System.out.println(obj.area());


    }

}
