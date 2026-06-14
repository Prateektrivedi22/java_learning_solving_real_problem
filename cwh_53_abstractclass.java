abstract class parent2 {
    public parent2() {
        System.out.println("i am a cvonstructor ");


    }
    public void sayhello(){
        System.out.println("hello");
    }

    abstract public void greet();
}

class child2 extends parent2{
    @Override
    public void greet(){
System.out.println("good morning");
    }


}
 abstract class chiild3 extends parent2{
    public void th(){
        System.out.println(" i am, good");

    }

}



public class cwh_53_abstractclass {
    public static void main(String [] args){
child2 c = new child2();
// parent2 p = new parent2(); throws an error 

    }
    
}
