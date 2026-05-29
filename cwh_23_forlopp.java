 import java.util.Scanner;
public class cwh_23_forlopp {

    public static void main(String[] args) {

        // for(int i = 0; i <= 10; i++) {
        //     System.out.println(i);
        // }



        // wap to print first n odd natural numbers using a for loop 

        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("enter the value of n : ");
        // int n = sc.nextInt();

        // for(int i=0; i<n; i++){
        //     System.out.println(2*i + 1 );

        // }

        // wap to print n natural nos to in fuinite 

        // for(int i=1; i>0; i++){
      
        // System.out.println(i);
        // }
        // wap to print first n natural nos in reverse order
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");
       int n  = sc.nextInt();

        
        for(int i=n; i!=0; i--){
        System.out.println(i);
        }
}
}