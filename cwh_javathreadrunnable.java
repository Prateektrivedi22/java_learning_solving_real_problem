
class myThreadrunnable1 implements Runnable{
    public void run(){
        System.out.println("ia ma a thread not a threat 1 ");
    }

}

class myThreadrunnable2 implements Runnable{
    public void run(){
        System.out.println("i am a  thread 2  not a threat 2 ");
    }

}


public class cwh_javathreadrunnable {
    public static void main(String[] args ){

myThreadrunnable1 obj1 = new myThreadrunnable1();
Thread obj3 = new Thread(obj1);
 myThreadrunnable2 obj2 = new myThreadrunnable2();
 Thread obj4 = new Thread(obj2);

obj3.start();
obj4.start();

    }
    
}
