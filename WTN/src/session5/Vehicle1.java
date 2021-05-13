package session5;
class Car1{
void display() {
System.out.println(" this is car");
}
void sys() {
System.out.println("this is sys");
}
}
class Bike1 extends Car1{
void display() {
System.out.println(" this is bike");
}
void m() {
System.out.println("this is m");
}
}



// when ever we are performing DMD the methods which are
//under the overriding still stick on with the process
public class Vehicle1{
public static void main(String[] args) {
Car1 c=new Bike1();
c.display();
c.sys();
}
}
