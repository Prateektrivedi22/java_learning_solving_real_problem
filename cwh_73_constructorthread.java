class MyThread extends Thread{

public  MyThread(String name){
    super(name);
  // calls the thread class constructor that accepts a name 

}
public void run(){
    int i = 0;
    while (i<100){
        System.out.println("i am a thread ");
        i++;
    }
}



}






public class cwh_73_constructorthread {
    public static void main (String[] args ){
        MyThread t1 = new MyThread("harry");
        MyThread t2 = new MyThread("hurrah ");

        t1.start();
        t2.start();

        System.out.println("the id of the thread is : " +t1.getId());
                System.out.println("the name  of the thread is : " +t1.getName());

    }
    
}
