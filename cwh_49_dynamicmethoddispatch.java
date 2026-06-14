class phone   {
public void showtime (){
    System.out.println(" show time is 8 am  ");
}
public void on  (){
    System.out.println("turning on phone ");

}


}
class smartphone extends phone{
    public void music (){
        System.out.println("play  music  ");

    }
    public void on (){
        System.out.println("turning on smartphone ");

    }
}



public class cwh_49_dynamicmethoddispatch {
    public static void main(String [] args){
        phone obj = new smartphone();
     
        obj.on();
        // obj.music(); // not allowwed
        obj.showtime();


    }

    
}
