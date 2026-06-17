interface Mycamera{
    void takesnap();
    void recordvideo();
    default void record4kvideo(){
        System.out.println("recording a 4k video ");
    }



}

interface Mywifi {
    String[] getnetworks();
    void connecttonetwork( String network);

}
class MyCellPhone{
    // void takeSnap(){
    //     System.out.println("taking snap ");
    // }
    // void callNumber(int phoneNumber){
        // System.out.println("calling" +  phoneNumber);

    // }
    void pickcall(){
        System.out.println("connecting");

    }
}
class Mysmartphone extends MyCellPhone implements  Mycamera , Mywifi {
    public void takesnap(){
        System.out.println("taking snap ");
     }
     public void recordvideo(){
        System.out.println("recording video ");

     }
    //   public void record4kvideo(){
    //     System.out.println("recording video in hd  ");

    //  }

public String[] getnetworks(){
    System.out.println("setting list of networks ");
    String[] networkList = {"harry", "prashant " , "potter "};
    return networkList; 
}
public void connecttonetwork( String network){
    System.out.println(" connecting to " + network);
}
}

public class cwh_57_defaultmethods {
    public static void main(String[] args){
        Mysmartphone obj = new Mysmartphone();
        obj.record4kvideo();
        //obj.getnetworks(); 
         String [] ar  = obj.getnetworks();
         for(String item : ar){
            System.out.println(item);
         } 




    }
    
}
