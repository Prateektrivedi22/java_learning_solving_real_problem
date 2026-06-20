

class mythread1 extends Thread{

    public void run(){
        int i =0;
        while(i<40){

        System.out.println("my  cooking tread is running  ");
                System.out.println(" i am happy  ");
       i++;
       
            }

    }

}

class mythread2 extends Thread{
    public void run(){
       int  i=0;

        while (i<40){

            
        System.out.println("  thread  2 is for chating with her  ");
                System.out.println(" i am sad  ");
          i++;
        } 
    }
}



public class cwh_70_creatingathread {
    public static void main(String[]args){
     mythread1 t1 = new mythread1();
          mythread2 t2 = new mythread2();
          t1.start();
          t2.start();


    }
}
