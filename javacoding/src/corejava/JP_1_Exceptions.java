package corejava;

/*Exception : exceptions are runtime error which stops the excution of program
*
* below we created class in which 18/0 leads to exception
*
* which stopped the executing j and bye print statements*/


public class JP_1_Exceptions {
    public static void main(String[] args) {

        //writing general exceptions

        int i= 0;
        int j=0;
        {
            j = 18 / i;
        }
        System.out.println(j);
        System.out.println("Bye");
    }

}
