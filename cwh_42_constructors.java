

     class MyMainEmployee{
        private int id ;
        private String name ;
        private int salary ;

// CONSTRCTORS :

        public MyMainEmployee(){
            id = 45;
            name = " codewithharry";

        }

        
        public MyMainEmployee(String myname , int myid , int mysalary  ){
            id = myid;
            name = myname;
            salary = mysalary;

        }
          public MyMainEmployee(String myname  ){
            id = 0;
            name = myname;

        }
        public int getsalary(){
            return salary ;
        }
        public void setsalary(int s){
            this.salary = s;
        }
        public String getName(){
            return name ;
        }
        public void setName(String n ){
            this.name = n;

        }
        public void setId(int i ){
            this.id = i ;

        } 
        public int  getid(){
         return id;

}
public class cwh_42_constructors {

    public static void main(String[] args){
        
        MyMainEmployee harry = new MyMainEmployee( "prateek trivedi" , 12 , 4500 );
        //harry.setName ("code with harry ");
      //  harry.setId(56);
        System.out.println(harry.getName());
        System.out.println(harry.getid());
                System.out.println(harry.getsalary());

    }
     }
    
}
