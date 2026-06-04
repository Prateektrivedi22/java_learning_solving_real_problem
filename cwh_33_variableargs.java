public class cwh_33_variableargs {
// static int sum(int a,int b ){
//     return a + b ;
// }
// static int sum(int a, int b, int c){
//     return a + b + c;

// }
// static int sum(int a, int b, int c, int d){
//     return a + b + c + d;

// }
static int sum( int x , int ...arr){
    int result = x;
    for(int a : arr){    // read as : for a in arr      
    result += a; 
    }
  return result;
}
   
    public static void main (String[] args){
        System.out.println("welcome to varargs tutorial");
        System.out.println(" the sum of 1 is : " + sum(1));

        System.out.println("the sum of 4 and 5 is : " + sum(4,5));
     System.out.println("the sum of  3, 4 and 5 is : " + sum(3, 4 , 5  ));
     System.out.println("the sum of  3, 4, 7 and 5 is : " + sum(3, 4 ,7 , 5  ));


    }
    
}
