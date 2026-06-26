import java.util.Scanner;

public class cwh_81 {
    public static void main(String [] args){
         // handling specific exceptions 

         int [] marks = new int[3];
         marks[1] = 45;
         marks[2] = 67;
         marks[0] = 34;

         Scanner sc = new Scanner(System.in);

          System.out.println("enter the array index");
          int ind = sc.nextInt();

          System.out.println( "enter the number : ");
          int number = sc.nextInt();
          try{
            System.out.println("the value at array ind entered is :" + marks[ind]);
         System.out.println("the value of arrayind/number is : " + marks[ind]/number);
        }
        catch( ArithmeticException e ){
            System.out.println("Arithmetic exception occured  ");
System.out.println(e);

        }

         catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBoundsException occured ");
          System.out.println(e);

        }
          
        catch(Exception e ){
            System.out.println("some error occured ");
             System.out.println(e);

        }
          

    }
    
}
