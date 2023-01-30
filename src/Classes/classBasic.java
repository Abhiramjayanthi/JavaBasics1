package Classes;
class Pen{
    String color;
    String type;
    String company;
    public  void write(){
        System.out.println("Writing something");
    }
    public  void Pen(){
        System.out.println("the color of the pen is"+color+"and the type of pen is"+type+"and the company of the pen is "+company);
    }
}

public class classBasic {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ballpoint";
        pen1.company = "flair";
        pen1.write();
        pen1.Pen();
    }

}
