
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("thank you " +this.getName());
        }

    }


}



public class cwh_javapriorities {
    public static void main(String [] args){
//CREATING THREADS 
MyThr t1 = new MyThr("harry1 ");
MyThr t2 = new MyThr("harry2");
MyThr t3= new MyThr("harry3");
MyThr t4= new MyThr("harry4");
MyThr t5= new MyThr("harry5");
//setting priority for the most imp thread
t5.setPriority(Thread.MAX_PRIORITY);

//STARING THREADS 
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();

    }
    
}
