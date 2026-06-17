interface sampleInterface {
    void meth1();
    void meth2();

}
interface childSampleInterface extends sampleInterface {
    void meth3 (); 
    void meth4();

}
class MysampleInterface  implements childSampleInterface  {
     public void meth1(){
      System.out.println("meth1") ;

    }
    public void meth2(){
System.out.println(" meth 2 ");

    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4"); 
    }
}





public class cwh_58_iheritancesininterfaces {
    public static void main (String[] args){
MysampleInterface obj = new MysampleInterface();

obj.meth1();
obj.meth2();
obj.meth3();
obj.meth4();


    }
    
}
