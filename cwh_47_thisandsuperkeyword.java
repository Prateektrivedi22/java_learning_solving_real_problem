class ekclass {
    int a ;
    
    public int geta(){
        return a ;
    }

    ekclass (int a ){
        this.a = a ;
        System.out.println("this is ek class ka constructor ");

    }
    public int returnone(){
        return 1 ;

    }
}
class doclass extends ekclass{
    doclass(int c ){
        super(c);
        System.out.println("this is a constructor ");
    }

}



public class cwh_47_thisandsuperkeyword {
    public static void main (String[] args){

        ekclass e = new ekclass(45);
        doclass d = new doclass(5);


    }
    
}
