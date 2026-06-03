public class cwh_32_methodoverloadinginjava {
    // method overloadinfg : when a class contains two or more methiods with the same name but different parameters. then such methiods are called as method overlosasading

    static void foo(){
        System.out.println("Good morning bro!");
    }
        static void foo(int a ){
            System.out.println("Good morning " + a + " bro!");
    
    }
            static void foo(int a , int b ){
                 System.out.println("Good morning" + " " +a + " " + "bro!");
                           System.out.println("Good morning  " + b + " bro!");

}
static void change(int a){
    a= 98;
}
static void change2(int[] arr){
        arr[0] = 98;
}
public static void main(String[] args){

// case 1 : chan gung the integer
int x = 45;
change(x);
System.out.println("the value of x after running the change is " + x );

// case 2 : cahnghigng the element of the artray
int[] marks = {45, 67, 89, 85, };
change2(marks);
System.out.println("The value of x after running change is: " + marks[0]);

    // method overloading
    foo();
    foo(3000);
    foo(3000 , 4000);
// arguments are actual!


             

}




}
