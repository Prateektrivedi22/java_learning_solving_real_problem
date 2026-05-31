public class cwh_27_foreachloop {
    public static void main(String[]args){
       
        int[] marks = new int[5];
         marks[0] = 50;
        marks[1] = 79;
        marks[2] = 78;
        marks[3] = 67;
        marks[4] = 98;
       // diisplaying array using naive way 

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

// displaying the array using for loop

// for( int i=0; i < marks.length; i++){
//     System.out.println(marks[i]);
// }
      
        
 // display the array using for loops in reverse order 
        // System.out.println("printing using for loop in revesrse order");
        // for(int i =marks.length -1 ; i>=0; i--){
        //    System.out.println(marks[i]);
        // }


        // display the array using for each loop 
          System.out.println("printing using for each  loop  ");
        for(int elements : marks){
           System.out.println(marks);
        }

    
    }

}
