import java.util.Scanner;

public class cwh_86_practicesetonerrors {
    public static void main(String[] args){
        // problem 1 ;
        // syntax errror  int a = 9     
    // logical error: 
    // int age = 78;
    // int year_born = 2000-78;
    // System.out.println(age/0);

    // problem 2 : write a java program that prints haha during arithmetic excerption and hehe during illegalarithmeticexception 
    // int a = 100;
    // int b = 0;

    
    
    // try{
    //     System.out.println(a/b);

    // }
 
    
    // catch(ArithmeticException e ){
    //     System.out.println("haha" ) ;  
    // }
    // catch(IllegalArgumentException e ){
    //     System.out.println("hehe" );
    // }

// problem 3 :
//write a program that allows yiou to keep accessibng an arrayuntil a valid index is given. if max retries exceeds 5 print "error"
 
 int  numbers [] = {5, 9 ,7, 3 , 89 , 84  };
Scanner sc = new Scanner(System.in);
 int retries = 0 ;
 while(retries <= 5 ){
    System.out.println("enter index : ");
    int index = sc.nextInt();

 
 if ( index >= 0 && index<numbers.length ){
    System.out.println(numbers[index]);
    break;
 }

else{
    retries++;
    System.out.println("invalid index");

}}
if(retries>=5){
System.out.println("error");

}

    
    
}
    }


