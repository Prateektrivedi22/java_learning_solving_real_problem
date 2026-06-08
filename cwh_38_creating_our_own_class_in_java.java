  class employee{
    int id;
    int salary;
    String name;


    public void printdetails(){
System.out.println("my id is :  " + id );
System.out.println(" my name is : " + name );
    } 
    public int getsalary(){
        return salary;
    } 

    
}



public class cwh_38_creating_our_own_class_in_java {

    
 


    public static void main(String[] args){
System.out.println("This is our custom class ");
 employee harry = new employee(); //instyantiating a mnesw employee object 
 employee jhon = new employee();

//  setting attributtes

     harry.id = 12;
      harry.name =  "harry";
      harry.salary = 34;

jhon.id = 21;
jhon.name = "jhon tripathi";
jhon.salary = 45;
      //printing attributtes
      harry.printdetails();
      jhon.printdetails();
int salary = jhon.getsalary();
System.out.println(salary);
      //System.out.println("The id of new employee is : " + harry.id);
     // System.out.println("the name of new employee is : " + harry.name);

    }
}
