package corejava;
/*why we cannot use non static variables(instant variables) inside a static method
because instant varibles VALUES are different for different objects which creates
confusion as which varible's object is it calling?
thats why show1() static method we are getting errors

Then how to call instant varibles inside static method?
by passing object as an argument we can call instant variables inside static method

why main method is static?
if its not static then it becomes non static method we have to create object for it
for created obj we need main method, so there is a deadlock for it
* */
public class JP_7_static_methods {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.price = 19000;
        Mobile.brand = "Samsung";
        obj.model = "S22 ultra";

        Mobile.show2(obj);

    }
}
