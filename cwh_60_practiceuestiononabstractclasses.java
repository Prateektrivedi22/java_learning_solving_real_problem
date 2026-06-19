 abstract class telephone{
   abstract  void ring();
      abstract  void lift();
         abstract  void disconect();


}
class smartphone extends telephone {


       public   void ring(){
        System.out.println("ringing ");
       }
      public   void lift(){
        System.out.println("lifting ");
      }
        public   void disconect(){
            System.out.println("disconnect ");
        }
    public  void touchscreen(){
        System.out.println("touhing the screen to give comand ");

    }
    }







interface basicAnimal{
    void eat();
    void sleep();


}



class monkey {
    void jump(){
        System.out.println("jumping japak ");
    }
    void bite (){
        System.out.println("bitting ");

    }
}
class human extends monkey implements basicAnimal {
    public void eat(){
        System.out.println("eating ");
    }
     public void sleep(){
        System.out.println("sleeping ");
     }


}



abstract class pen  {

abstract  void write ();
abstract void refill();


}
class fountainpen extends pen{
     void write (){
        System.out.println("writing ");
    }
     void refill(){
                System.out.println("refilling  ");

     }
       void changenib(){
        System.out.println("changenib");
        
     }


}  




public class cwh_60_practiceuestiononabstractclasses {
    public static void main(String [] args ){
        /*  question no 1 
         create an abstract class pen with the methods 
        write() and refil() as abstract methods 
        */
// fountainpen obj = new fountainpen();
// obj.write();
// obj.refill();
// obj.changenib();


/* question 3 + uestion no 5 
create a class monkey with jump() and bite methods.
 create a class human whivh inherits tis monkey class and
  implements basicanimal inteface with eat() and sleep() methods . +
  +
  demonstrate polymorphism 
 */

//  Q3:
 // human obj2 = new human();
  
//     obj2.eat();
//   obj2.sleep();
//   obj2.jump();
//   obj2.bite();



// Q5 :
monkey obj3 = new human ();

  obj3.jump();
    obj3.bite();
    //   obj3.sleep();
    //   obj3.eat();
// cannot implement eat and sleep because the referencde method is monkey which does not have speak method  



//   
// Q4:
/* create a class telephone with ring() , lift() and disconnect() methods as abstract methods .
create another class smartphone and demonstrate polymorphism.
*/
  



  }

    }
    

