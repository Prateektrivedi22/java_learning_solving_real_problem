interface Bicycle {
    void applybrake( int decrement);
    void speedup(int increment);

}
interface hornBicycle{
    int a = 45 ; 
    void blowhorn3kg();
    void blowhornhd();
}

class avoncycle implements Bicycle , hornBicycle {
    void blowhorn(){
        System.out.println(" pee peee poo ");
    }
    public void applybrake( int decrement){
        System.out.println("applying brake");
    }
    public void speedup(int increment){
        System.out.println("speeding up");
}

public void blowhorn3kg(){
    System.out.println("blowhorn3kgontop");
}
   public  void blowhornhd(){
        System.out.println("blowhornhdokboss");
    }
}

public class cwh_54_interfaces {
    public static void main(String[]args){
        avoncycle cycleHarry = new avoncycle();
        cycleHarry.applybrake(7);
        //YOU CAN CREATE PROPERTIES IN INTERFACE
        System.out.println(cycleHarry.a);
        //you cannot m0odify the bpropertiwes bin interfaces as trhey are final 
// cycleHarry.a = 454 ;
// System.out.println(cycleHarry.a);

cycleHarry.blowhorn3kg();
cycleHarry.blowhornhd();



    }

}
