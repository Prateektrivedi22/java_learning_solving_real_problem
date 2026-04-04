import java.util.Scanner;
public class cwh_18_elseif {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("enter your age ");
int age = sc.nextInt();


       
//         if (age < 18 ){
//             System.out.println("you are a kid" );

//         }
//         else if(age == 18 ){
//             System.out.println("you are a teenager ");
//         }
//         else if(age >18 && age <60){
//             System.out.println("you are an adult");

//         }
//         else {
//             System.out.println("you are a senior citizen");
//         }


switch(age){
    case 18:
    System.out.println(("you are going to become an adult"));
break;
case 23:
System.out.println("you are going to join a job ");
break;
case 60:
System.out.println("you are going to get retired");
break;
default:
    System.out.println(("enjoy your life"));
}


    
    }
}