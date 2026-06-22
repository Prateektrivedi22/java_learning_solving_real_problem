class GoodMorning extends Thread {
   
    public void run (){
        while(true){
        System.out.println("goood morning ");
        try{
            Thread.sleep(500);
        }catch(Exception e ){}
        }
    }

   

}
class  Welcome1 extends Thread{
    public void run(){
        while (true){
            System.out.println("welcome");
            try{
            Thread.sleep(1000);
        }catch(Exception e ){}

        }
    }

}





public class cwh_76_ptracticequestiononthreads {
    public static void main(String[] args ){
// questions 
// 1 : wap to print "good morning" and "welcome" continuosly on the screen in java using threads  
// 2 : addd a sleep method in both the threads
GoodMorning m1 = new GoodMorning();
m1.setPriority(6);
System.out.println(m1.getPriority());

Welcome1 w1 = new Welcome1();
w1.setPriority(8);
System.out.println(w1.getPriority());

// m1.start();
//  w1.start();

    }
    
}
