class base {
    int x;
    public int getx() {
        return x ;
    }
    public void setx(int x ){
        System.out.println("i am in base and setting x now ");
         this.x = x ;
    }
    public void printme(){
        System.out.println("i am a costructor");

    }



}
class derived   extends base {
        public int y ;


        public int gety() {
        return y ;
     }
    public void sety(int y ){
        this.y = y;
    }

}
public class cwh_45_inheritance {
    public static void main(String [] args){
     // creating an object of base class    
        base  b = new base();
        b.printme();
        b.setx(4);
    System.out.println(b.getx());

// creating an object of derived class 
     derived d = new derived();
      d.setx(4);
    System.out.println(d.getx());
        d.sety(5);
    System.out.println(d.gety());





    }
    
}
