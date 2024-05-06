package corejava;
/*Strings : grp of characters*/

public class JP_5_Strings {
    public static void main(String[] args) {
        /*String declaration and its methods */
        String fname = new String("Kiran");
        System.out.println(fname);

        String lname = "Kumar";

        System.out.println(fname+lname); //string concatenation
        System.out.println(fname+" "+lname+" "+"reddy");
        /*getting characters in the string*/

        char ch = fname.charAt(0);
        System.out.println(ch);

        /*ASCII value of character in the string*/
        int ch1 = fname.charAt(0);
        System.out.println(ch1);

        /*why strings are immutable*/
    }
}
