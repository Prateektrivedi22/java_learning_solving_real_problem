

     class Myemployee{
        int id;
        String name;

        public String getName(){
            return name;
        }
        public void setName(String n ){
             name = n ;
            
        } 
        public int getid(){
            return id ;

        }
        public void setid(int i){
            id = i ;
        }
        public class cwh_40_modifiers {
    }
    public static void main(String[] args) {
        Myemployee harry = new Myemployee();
        // harry.id = 45;
        // harrry.name = "code with harry"
        //this throws an error due to private acces modidfiers 
        harry.setName("CODE WITH HARRY ");
        System.out.println(harry.getName());
        harry.setid(500);
        System.out.println(harry.getid());


        }
}
