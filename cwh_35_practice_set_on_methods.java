public class cwh_35_practice_set_on_methods  {
    // static void multiplication(int n ){
    //     for(int i = 1;i<=10;i++){
    //         System.out.format("%d * %d = %d\n " ,n , i , n*i  );

            static void printpattern() {
                for( int i = 1; i<=4; i++ ){
                    for(int j = 1 ; j <= i; j++ ){
                        System.out.print("*");

                    }
                    System.out.println();
                }

            }

        
    public static void main(String[] args){
        // problem 1 : write a java prgrm to print he multipication table of a number n 
       
        // multiplication( 7);


        printpattern();
        
    }
}