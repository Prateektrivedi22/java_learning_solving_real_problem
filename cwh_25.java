import java.util.Scanner;

public class cwh_25 {
    public static void main(String[]args){
        // wap to print the stars pattern
        // ****
        // ***
        // **
        // *
        // for(int i=4; i>0; i--){
        //     for(int j=1; j<=i; j++)
        //         System.out.print("*");
        //         System.out.println();
        // }

// wap to print the sum of first n  even  numbers 
   
Scanner sc = new Scanner(System.in);

System.out.println("ENTER THE VALUE OF n : ");
int n = sc.nextInt();
// int sum = 0;
// int i = 0;
 
// while(i<N){
//      sum = sum + (2*i);
    
    
//     i++;
// }
// System.out.print(" SUM OF EVEN NUMBERS IS :   ");
// System.out.println(sum);

// wap to write yhe multiplication table of a given number n 

// for(int i=0; i<=10; i++)
//     System.out.printf("%d * %d = %d\n" , n , i , n*i);

// wap to print the multiplication table of 10 in reverse order
// for(int i = n; i>=0; i--){
// System.out.printf("%d * %d = %d\n" , n, i, n*i); 
//     }

// wap to find factorial of a givenj  number using for loop 

// factorail(n) = n*(n-1)*(n-2)*(n-3)...
// int fact = 1;
// for(int i=n; i>0; i-- ){
//     fact = fact * i;
   
// }
//  System.out.print("factorial of " + n + " = " + fact);


// // repeat the above problem ussing while loop
// int fact = 1;
// int i = 1 ;
// while(i<=n){
//    fact = fact * i;
  
//     i++;
// }  
//  System.out.println("factorial of " + n + "=" + fact );

// wap to calculate the sum of numbers occuring in the multiplication table of 8 

int sum = 0;

for(int i=0; i<=10; i++){
    sum += n*i;
     


}
System.out.println(sum);
}
}
