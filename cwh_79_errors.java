
import java.util.Scanner;
public class cwh_79_errors{
    public static void main(String[] args ){

        // syntrax errors 
        // int a =9 no semicolon , syntax error 
        // b = 4; variable not declared , syntax error 

        // LOGICAL ERRORS 
// PRINT ALL THE PRIME NUMBERS THAT ARE BTW 1 TO 10
// for (int i = 1; i<5;i++ ){
//     System.out.println(2*i +1 );
// }
// this logic fails to account for non prime nunber  like 9 


// RUNTIME ERROR 
Scanner sc = new Scanner(System.in);
int  K = sc.nextInt();
if(K != 0){
System.out.println(1000/K);}
else{
    System.out.println("unexpected issue ocured") ;

    
}

}
// if the user inputs 0 , to the program then it throws an arithmetic exception

    }
