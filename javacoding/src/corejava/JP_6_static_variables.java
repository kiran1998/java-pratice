package corejava;
/*what are static variables
* variables which are shared by all the objects are static variables
* static varibles are called using class name as below Mobile.name
*
* why we can use static variables inside non static method
* as static varibale is shared by all objects, which means when we
* use static varible where its value cannot be different for diiferenct obj
* so compiler will not give any error for it
* */

class Mobile{
    String model;
    double price;
    static String brand;
    public void show(){
        System.out.println("Brand :"+brand+ "\n Price :"+price+"\n Model :"+model);
    }

//    public static void show1(){
//        System.out.println("Brand :"+brand+ "\n Price :"+price+"\n Name :"+name);
//    }

    public  static void show2(Mobile m){
        System.out.println("Brand :"+Mobile.brand+ "\n Price :"+m.price+"\n Model :"+m.model);
    }
}
public class JP_6_static_variables {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.price = 9999;
        Mobile.brand = "Samsung";
        obj.model = "14";

        obj.show();
    }
}
