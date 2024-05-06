package corejava;


/*In order to execute those 2 statments
we write critical statement in try block
* if exception occurs it throws it in catch block
* so that below statements will be executed irrespective of critical statement*/


/*uses of try block
* 1.its best pratice to write critical statements in try block (ps : we can write normal statements too)
* 2.we can create multiple trycatch blocks for critical statments
* 3.multiple critical statements can be written in try block
*
*
* donts with try block
* 1.cannot write try block after try block
*
* */
public class JP_2_trycatch {
    public static void main(String[] args) {
        int i= 0;
        int j=0;
        String str = null;

        int arr[]= new int[5];
//        try {
//            j = 18 / i; //if i=0 exception will occur and catch block will be executed
//                        //if i != 0 catch block will not be executed
//
//        }
//        catch (ArithmeticException e){
//            System.out.println("Division by 0 is not allowed :"+e);
//        }
        try{
            System.out.println(str.length() );
//            System.out.println(arr[5]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("you are accessing ele out of array size :");
        }
        catch (NullPointerException e){
            System.out.println("Declared string is null"+e);
        }
        catch (Exception e){
            System.out.println("unknown exception ");
        }
        System.out.println("j :"+j);
        System.out.println("Bye");
    }

}
