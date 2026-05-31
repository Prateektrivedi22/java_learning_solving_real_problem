public class cwh_26_arrays{
    public static void main(String[]args){
           
        /*
        classroom of 5 students : you have to print the marks of 500 students
        you have two options :
        1/ make 500 variables
        2/ use arrays 
        */

        // there are many ways to create an array . these are listed below :
        // 1: declaration and mmemory allocation
        // int [] marks = new int[5];       
       

        // 2: declartation and then memory allocation
        // int[] marks;
        // marks =new int[5];

        // 3: declaration , memory allocation and intialization
        
        int [] marks = {50,79,78,67,98};
        



        // initialization
        // marks[0] = 50;
        // marks[1] = 79;
        // marks[2] = 78;
        // marks[3] = 67;
        // marks[4] = 98;


        System.out.println(marks[3]);
        System.out.println(marks.length);

    }

}