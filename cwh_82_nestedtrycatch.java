import java.util.Scanner;

public class cwh_82_nestedtrycatch{
public static void main(String[] args) {
    int [] marks = new int[3];
         marks[1] = 45;
         marks[2] = 67;
         marks[0] = 34;

         Scanner sc = new Scanner(System.in);
          

          System.out.println("enter the number of index : ");
         int ind = sc.nextInt();
         try{
            System.out.println("this is video no 82 of java classes ");
            try{
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e ){
                System.out.println("sorry this index does not exist ");
                System.out.println("Exception in level 2 ");

            }

         }
    catch( Exception e ){
        System.out.println(" sorry we cannot do as command due to some twchnical error ");

    }
}
}

