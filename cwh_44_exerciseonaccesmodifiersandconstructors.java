class cylinder {
    int radius ; 
    int height; 


    public int  getradius(){
        return radius;
    }
    public void  setradius(int n ){
        radius = n;
    }
    public int getheight(){
        return height ; 
    }
    public void setheight(int m ){
        height = m; 

    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
    public double surfaceArea(){
        return 2* 3.14*radius*radius + 2*3.14*radius*height;
    }
}

class rectangle {
 private int length;
 private int breadth;

 public rectangle() {

    this.length = 4  ;
    this.breadth = 5 ;


 }
 public rectangle(int length , int breadth ){
    this.length = length ;
    this.breadth = breadth ;
 }

public int getlength(){
    return length ;
}

 public void setlength(int n ){
    length = n ;
 }
 public int getbreadth(){
    return breadth;
 }
 public void setbreadth(int m ){
    breadth = m ;

 }

}


public class cwh_44_exerciseonaccesmodifiersandconstructors {
    public static void main(String[] args){          
        //  create a class cylinder and use getter and setter to set its radius and heihgt 

 cylinder mycylinder   = new cylinder();
mycylinder.setheight(45);
mycylinder.setradius(34);

System.out.println(mycylinder.getradius());
System.out.println(mycylinder.getheight());
    // use  1 to calculate the surface area and volume of cylinder 

 System.out.println(mycylinder.surfaceArea());
 System.out.println(mycylinder.volume());

  rectangle r = new rectangle ( 12, 15 );

// rectangle.setlength(4);
 System.out.println(r.getlength());
 System.out.println(r.getbreadth());

    } 

   
}
