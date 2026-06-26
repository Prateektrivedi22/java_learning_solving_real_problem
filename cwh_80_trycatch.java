public class cwh_80_trycatch {
    public static void main (String [] args){
        int a = 8000;
        int b = 0;
        // try catch block to handle the  potential 
        try{
            int c = a/b;
            System.out.println("the rsult is " +c );
        }
        catch(  Exception e ){
            System.out.println("we failed to divide . reason :");
            System.out.println(e);

        }
        System.out.println("end of the program ");
    }
    
}
