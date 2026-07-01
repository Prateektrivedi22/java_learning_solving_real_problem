import java.util.*;

public class cwh_91_arraylist {
    public static  void main(String[] args ){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(6);
        l2.add(6);
     l2.add(7);
     l2.add(8);

        l1.add(6);
     l1.add(7);
     l1.add(8);
     l1.add(0 ,9);
    
    for (int i = 0 ; i<l1.size() ; i++){
        System.out.println(l1.get(i));
    }
    
    }

    
}
