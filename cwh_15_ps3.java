public class cwh_15_ps3 {
    public static void main(String[] args) {
        // problem 1 : convert a string to lower case 
        String name1 = "Prateek Trivedi ";
        System.out.println(name1.toLowerCase());
        String name2 = "RISHABH MISHRA ";
        String name3 = "PUSHPENDRA THAKUR";
        System.out.println(name2.toLowerCase());
        System.out.println(name3.toLowerCase());
        // problem2 =: a java program to replace spaces with underscores
        String name4 = "Prince Mishra ";
        name4 = name4.replace(" ", "_");
        System.out.println(name4);
        String name5 = "prateek trivedi  ";
        name5 = name5.replace(" ","_");
        System.out.println(name5);
// problem3 : a java program to assign the name of a person in a letter
String name6 = "Dear <name/> , Thankls a lot!";
name6 = name6.replace("<name/>", "Prateek Trivedi");
System.out.println(name6);
// problem4 : a java program to detect double and triple spaces 
String name7 = "this string contains  double and triple spaces";
 System.out.println(name7.indexOf("  "));
 System.out.println(name7.indexOf("   "));
//  a program to format the following letter using escape sequence characters
String myLetter = ("Dear Prateek ,\n\t This is a nice letter. \n thanks!");
System.out.println(myLetter);
}
}

