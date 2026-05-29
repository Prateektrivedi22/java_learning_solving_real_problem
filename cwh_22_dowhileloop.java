import java.util.Scanner;
public class cwh_22_dowhileloop {
    public static void main(String[] args){
        int b = 10; 
        // do{
        //     System.out.println(b);
            

        // }while(b<5);

        // wap to print the first n natural nos using do while loop
       
       Scanner sc = new Scanner(System.in);

       System.out.println("enter the value of n ");
       int n = sc.nextInt();

       
       
       
       
        int i = 1;
        do {
            System.out.println(i);
            i++;
    
        } while(i <= n);
sc.close();



    }
}
