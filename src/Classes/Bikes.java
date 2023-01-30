package Classes;

public class Bikes {
    static int wheels = 2;
    String color = " ";

    //functions with static and without static
    static void braking() {
        System.out.println("By using brakes we can stop the vehicle");
    }

    void mileage(int m) {
        System.out.println("mileage is" + m);
    }

    public static void main(String[] args) {

        Bikes Re = new Bikes();
        Bikes Honda = new Bikes();
        Bikes jawa = new Bikes();
        System.out.println(wheels);
        System.out.println(wheels);
        System.out.println(wheels);

        Re.color = "Grey";
        Honda.color = "Black";
        jawa.color = "red";
        System.out.println(Re.color);
        System.out.println(Honda.color);
        System.out.println(jawa.color);

        //calling static method/function
        braking();
        braking();
        braking();

        //calling function
        Re.mileage(28);
        Honda.mileage(30);
        jawa.mileage(32);


    }
}
